FROM openjdk:8
#ARG JAR_FILE=/home/runner/work/SampleApp/SampleApp/target/sample.jar
#COPY ${JAR_FILE} sample.jar
ADD target/sample.jar sample.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","sample.jar"]
