FROM openjdk:17
LABEL maintainer="prasad.net"
ADD target/SpringDockerJenks-0.0.1-SNAPSHOT.jar SpringDockerJenks.jar
ENTRYPOINT ["java","-jar","SpringDockerJenks.jar"]