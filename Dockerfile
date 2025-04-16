#FROM eclipse-temurin:17-jdk-alpine AS build
#WORKDIR /workspace/app

# Install Maven
#RUN apk add --no-cache maven
#WORKDIR /workspace/app

# Copy pom.xml first for better layer caching
#COPY pom.xml .
# This step will cache dependencies if pom.xml doesn't change
#RUN mvn dependency:go-offline

# Copy source code
#COPY src ./src

# Build the application
#RUN mvn clean package -DskipTests
#WORKDIR /app
#FROM openjdk:8
FROM openjdk:17-jdk-slim
#ARG JAR_FILE=/home/runner/work/SampleApp/SampleApp/target/sample.jar
#COPY ${JAR_FILE} sample.jar
# Set working directory
# Add a volume pointing to /tmp
#RUN mvn clean package -DskipTests
#COPY --from=build /app/target/*.jar sample.jar

VOLUME /tmp
COPY target/*.jar sample.jar
#RUN ls -la /app/staging
EXPOSE 8085
ENTRYPOINT ["java","-jar","sample.jar"]
