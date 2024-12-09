FROM openjdk:21
EXPOSE 8080
ADD target/weather-docker.jar weather-docker.jar
ENTRYPOINT ["java","-jar","/weather-docker.jar"]