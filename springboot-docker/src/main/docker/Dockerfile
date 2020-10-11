FROM openjdk:16-jdk-alpine

VOLUME /tmp

ADD docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
