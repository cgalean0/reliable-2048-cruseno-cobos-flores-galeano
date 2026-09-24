#!/bin/bash
EVOSUITE_JAR="evosuite-1.0.6.jar"
TARGET_CLASS="ar.edu.unrc.game2048.Cell"
SEARCH_BUDGET=60

mvn clean compile
CLASS_PATH=$(pwd)/target/classes

java -Xmx2g -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

mvn test
