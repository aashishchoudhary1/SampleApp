FROM maven:3.9.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
#FROM openjdk:8
FROM openjdk:17-jdk-slim
#ARG JAR_FILE=/home/runner/work/SampleApp/SampleApp/target/sample.jar
#COPY ${JAR_FILE} sample.jar
# Set working directory
# Add a volume pointing to /tmp
RUN mvn clean package -DskipTests
COPY --from=build /app/target/*.jar sample.jar

VOLUME /tmp
#COPY target/*.jar sample.jar
#RUN ls -la /app/staging
EXPOSE 8085
ENTRYPOINT ["java","-jar","/app/sample.jar"]
