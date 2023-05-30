FROM maven:3-jdk-8-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean
RUN mvn package  -DskipTests=true -Dmaven.test.skip=true
FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/application.jar target/app.jar
CMD ["java" , "-jar" , "target/app.jar"]
