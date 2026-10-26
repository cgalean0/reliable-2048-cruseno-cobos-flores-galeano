#!/bin/bash

mkdir -p daikon-traces
rm -f daikon-traces/*.dtrace daikon-traces/*.dtrace.gz

mvn clean test-compile

# 1. Corrección: Resolución del Classpath de Maven
mvn dependency:build-classpath -Dmdep.outputFile=target/cp.txt -q
MAVEN_CP=$(cat target/cp.txt)
BASE_CP="target/classes:target/test-classes:$MAVEN_CP"

DAIKON_JAR="lib/daikon.jar"
RANDOOP_JAR="lib/randoop-all-4.3.4.jar"
PPT_PATTERN="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell"

echo "=================================================="
echo "1. Trazas: Test Suite Manual (JUnit)"
echo "=================================================="
# 2. Corrección: Archivos únicos con --dtrace-file
java -cp "$DAIKON_JAR:$BASE_CP" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --dtrace-file=daikon-traces/manual.dtrace.gz \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.BoardTest ar.edu.unrc.game2048.CellTest

echo "=================================================="
echo "2. Trazas: Randoop Test Suite"
echo "=================================================="
# 3. Corrección: Rutas específicas de los paquetes de Randoop
java -cp "$DAIKON_JAR:$RANDOOP_JAR:$BASE_CP" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --dtrace-file=daikon-traces/randoop.dtrace.gz \
     org.junit.runner.JUnitCore \
     randoopTests.board.RegressionTest0 randoopTests.cell.RegressionTest0


echo "=================================================="
echo "3. Trazas: Fuzzer (MainCLI con generador.py)"
echo "=================================================="
# Pasa la salida limpia de generador.py a la ejecución instrumentada de Chicory
python3 generador.py | java -cp "$DAIKON_JAR:target/classes" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --dtrace-file=daikon-traces/fuzzer.dtrace.gz \
     ar.edu.unrc.game2048.MainCLI

echo "=================================================="
ls -l daikon-traces/
