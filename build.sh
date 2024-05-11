#!/bin/bash
#
# This script builds the java program using Maven, and then builds a 
# Podman container from it.

JAVA_HOME=/usr/lib/jvm/java-17 
JAVA_HOME=$JAVA_HOME mvn package &&
  podman build -t java_docker_test .

