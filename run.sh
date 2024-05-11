#!/bin/sh
#
# This is the start script for the Java memory test application in a
#   container. 
#
#java -jar java_docker_test-0.0.1-jar-with-dependencies.jar
# java -Xmx999m -Xms99m -jar java_docker_test-0.0.1-jar-with-dependencies.jar
java -XX:MaxRAMPercentage=70 -XX:InitialRAMPercentage=20 -jar java_docker_test-0.0.1-jar-with-dependencies.jar

