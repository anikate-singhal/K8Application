# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jdk-alpine

WORKDIR /app


ADD mailerapp.jar mailerapp.jar
EXPOSE 8082
CMD ["java", "-jar", "mailerapp.jar"]