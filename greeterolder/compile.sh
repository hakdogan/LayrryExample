#!/usr/bin/env bash

mkdir -p ../mods/greeterolder

javac -d ../mods/greeterolder \
src/main/java/module-info.java \
src/main/java/com/kodcu/greeter/Greeter.java
