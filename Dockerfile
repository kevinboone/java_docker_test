FROM openjdk:17-alpine
ADD target/java_docker_test-0.0.1-jar-with-dependencies.jar .
ADD ./run.sh .
ENTRYPOINT ["/run.sh"]
