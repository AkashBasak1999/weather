FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/weather-docker.jar .
EXPOSE 8080
ADD target/weather-docker.jar weather-docker.jar
ENTRYPOINT ["java","-jar","/app/weather-docker.jar"]
