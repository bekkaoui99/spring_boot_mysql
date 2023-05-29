FROM maven:3.9.2-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean
RUN mvn package  -DskipTests=true -Dmaven.test.skip=true
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/application.jar target/app.jar
CMD ["java" , "-jar" , "target/app.jar"]
