#!/bin/bash

clang++ -c -fPIC AllowedClass.cc -o AllowedClass.o -I"$JAVA_HOME"/include
clang++ -shared -fPIC AllowedClass.o -o libAllowedClass.a -lc

