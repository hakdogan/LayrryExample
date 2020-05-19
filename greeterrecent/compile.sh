#!/usr/bin/env bash

mkdir -p ../mods/greeterrecent

javac -d ../mods/greeterrecent \
src/main/java/module-info.java \
src/main/java/com/kodcu/greeter/Greeter.java
