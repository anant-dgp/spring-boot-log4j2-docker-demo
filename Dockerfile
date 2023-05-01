FROM openjdk:8-jdk-alpine
MAINTAINER vaxa.in
EXPOSE 8090
COPY target/spring-boot-log4j2-docker-demo-0.0.1-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java","-jar","/my-app.jar"]