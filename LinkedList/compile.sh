#!/bin/bash
[ -d build ] || mkdir build
javac -d build -sourcepath src src/Program.java