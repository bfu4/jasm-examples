#!/bin/bash

clang++ -c -fPIC AllowedClass.cc -o AllowedClass.o -I"$JAVA_HOME"/include
clang++ -shared -fPIC AllowedClass.o -o libAllowedClass.so -lc

javac --enable-preview -source 17 Main.java
