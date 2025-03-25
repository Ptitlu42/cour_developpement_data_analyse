#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Usage: $0 [problem number]"
    echo "Example: $0 1 (to test P01)"
    exit 1
fi

NUM=$1

if [ $NUM -lt 10 ]; then
    PROB="P0$NUM"
else
    PROB="P$NUM"
fi

echo "Testing problem $PROB..."

mkdir -p temp_tests
mkdir -p temp_src

cp -r src/test/scala/p99/*.scala temp_tests/
cp -r src/main/scala/p99/*.scala temp_src/

rm src/test/scala/p99/*.scala
rm src/main/scala/p99/*.scala

if [ ! -f "temp_src/$PROB.scala" ]; then
    echo "Error: Source file $PROB.scala does not exist"
    rm -rf temp_tests temp_src
    exit 1
fi

if [ ! -f "temp_tests/${PROB}Spec.scala" ]; then
    echo "Error: Test file ${PROB}Spec.scala does not exist"
    rm -rf temp_tests temp_src
    exit 1
fi

cp "temp_src/$PROB.scala" src/main/scala/p99/
cp "temp_tests/${PROB}Spec.scala" src/test/scala/p99/

echo "Running test for $PROB..."
sbt test

rm src/test/scala/p99/*.scala
rm src/main/scala/p99/*.scala
cp temp_tests/*.scala src/test/scala/p99/
cp temp_src/*.scala src/main/scala/p99/

rm -rf temp_tests
rm -rf temp_src

echo "Test completed for $PROB"