#!/usr/bin/env bash

javac -d mods \
--module-path mylib \
--module-source-path "./*/src/main/java/" \
$(find ./*/src/main/java/ -name "*.java")