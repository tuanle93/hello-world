FROM openjdk:8-jdk-alpine
# ARG BASE_IMAGE
# FROM $BASE_IMAGE

WORKDIR /tmp

COPY target/*.jar hello-world.jar

# ENV PORT 8080
EXPOSE 8080

# CMD java -jar hello-world.jar