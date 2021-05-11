# FROM openjdk:8-jdk-alpine
ARG BASE_IMAGE
FROM $BASE_IMAGE

WORKDIR /

COPY target/spring-boot-0.0.1-SNAPSHOT.jar hello-world.jar

ENV PORT 8080
EXPOSE $PORT

CMD java -jar hello-world.jar