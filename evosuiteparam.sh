#!/bin/bash
set -e

if [ $# -eq 0 ]; then
  echo "Uso: $0 <Clase> [Clase2 ...]"
  echo "Ejemplo: $0 Cell"
  exit 1
fi

EVOSUITE_JAR="${EVOSUITE_JAR:-lib/evosuite-1.0.6.jar}"
PKG="ar.edu.unrc.game2048"
SEARCH_BUDGET="${SEARCH_BUDGET:-120}"
TEST_DIR="src/test/java"
PKG_DIR="$TEST_DIR/${PKG//.//}"

if [ ! -f "$EVOSUITE_JAR" ]; then
  echo "No existe $EVOSUITE_JAR"
  exit 1
fi

# Compilar una sola vez
mvn clean compile -q
CLASS_PATH="$(pwd)/target/classes"

# Generar tests con EvoSuite para cada clase pasada por CLI
for C in "$@"; do
  java -Xmx2g -jar "$EVOSUITE_JAR" \
    -projectCP "$CLASS_PATH" \
    -class "$PKG.$C" \
    -Dsearch_budget="$SEARCH_BUDGET" \
    -Dtest_dir="$TEST_DIR"
done

# Ajuste opcional para que JaCoCo registre bien la cobertura
# (EvoSuite genera separateClassLoader = true)
if [ "${FIX_CLASSLOADER:-0}" = "1" ]; then
  for C in "$@"; do
    sed -i 's/separateClassLoader = true/separateClassLoader = false/' \
      "$PKG_DIR/${C}_ESTest.java"
  done
fi

# Correr solo los _ESTest de las clases pasadas (Cell -> Cell_ESTest)
TESTS=$(printf "%s_ESTest," "$@")
mvn clean test -Dtest="${TESTS%,}" -Dmaven.test.failure.ignore=true jacoco:report
