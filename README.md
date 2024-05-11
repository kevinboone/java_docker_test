# java\_docker\_memory\_test

This is a simple Java program that displays its platform memory
(as reported to the JVM by the operating system), and the initial
and maximum heap sizes. Its purpose is to experiment with how
heap sizes are allocated in a container environment, if the 
Java command line does not specify any `-Xmx` or `-Xms` values.

- `build.sh` : A script to compile the Java using Maven, and build it into
  a Podman image

- `Dockerfile` : Image build specification, for use with `docker build` 
  or `podman build` 

- `pom.xml` : the usual Maven project file

- `run.sh` : a script to run the Java program, that serves as the entry
  point in the container image

- `src` : Java source code 

For information on how/why to use this program, please see 
[the article on my website](https://kevinboone.me/java_container_awareness.html).



