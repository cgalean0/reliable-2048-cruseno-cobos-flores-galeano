#!/bin/bash

echo "=================================================="
echo "Preparando el entorno..."
echo "=================================================="
# Crear carpeta de trazas y limpiar archivos viejos
mkdir -p daikon-traces
rm -f daikon-traces/*.dtrace

# Compilar código fuente y código de tests
mvn clean test-compile

# Configurar variables de Classpath (CP)
# Extraemos el classpath de Maven (dependencias de JUnit, etc)
MAVEN_CP=$(mvn dependency:build-classpath -q -DforceStdout)
BASE_CP="target/classes:target/test-classes:$MAVEN_CP"

# Ubicación de los JARs (Verifica que estas rutas coincidan con tu proyecto)
DAIKON_JAR="lib/daikon.jar"
RANDOOP_JAR="lib/randoop-all-4.3.4.jar"
EVOSUITE_JAR="lib/evosuite-1.0.6.jar"

# Patrón para que Daikon solo instrumente las clases que nos importan
PPT_PATTERN="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell"

echo "=================================================="
echo "1. Trazas: Test Suite Manual (JUnit)"
echo "=================================================="
java -cp "$DAIKON_JAR:$BASE_CP" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.BoardTest ar.edu.unrc.game2048.CellTest

echo "=================================================="
echo "2. Trazas: Randoop Test Suite"
echo "=================================================="
# IMPORTANTE: Revisa el nombre de la clase de Randoop. Por defecto es RegressionTest0.
# Si tienes varias (RegressionTest0, RegressionTest1), agrégalas separadas por un espacio.
java -cp "$DAIKON_JAR:$RANDOOP_JAR:$BASE_CP" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore \
     randoopTests.RegressionTest0

echo "=================================================="
echo "3. Trazas: EvoSuite Test Suite"
echo "=================================================="
# Las clases de EvoSuite suelen terminar en _ESTest
java -cp "$DAIKON_JAR:$EVOSUITE_JAR:$BASE_CP" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.Board_ESTest ar.edu.unrc.game2048.Cell_ESTest

echo "=================================================="
echo "4. Trazas: Fuzzer (MainCLI)"
echo "=================================================="
# Pasamos la salida del fuzzer por pipe a la ejecución instrumentada de Chicory
python3 fuzzer.py | java -cp "$DAIKON_JAR:target/classes" \
     daikon.Chicory \
     --ppt-select-pattern="$PPT_PATTERN" \
     --output-dir=daikon-traces \
     ar.edu.unrc.game2048.MainCLI

echo "=================================================="
echo "¡Trazas generadas con éxito!"
echo "Listando archivos en daikon-traces/:"
ls -l daikon-traces/*.dtrace
echo "=================================================="
echo "Para generar el archivo unificado de invariantes, ejecuta:"
echo "java -cp lib/daikon.jar daikon.Daikon daikon-traces/*.dtrace > daikon-unificado.txt"