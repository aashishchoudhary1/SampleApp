FROM openjdk:8
#ARG JAR_FILE=/home/runner/work/SampleApp/SampleApp/target/sample.jar
#COPY ${JAR_FILE} sample.jar
# Set working directory
WORKDIR /app
# Add a volume pointing to /tmp
VOLUME /tmp
COPY target/*.jar sample.jar
#RUN ls -la /app/staging
EXPOSE 8085
ENTRYPOINT ["java","-jar","/app/sample.jar"]
