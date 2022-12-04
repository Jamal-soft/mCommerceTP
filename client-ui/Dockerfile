FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} client-ui.jar
ENTRYPOINT ["java","-jar","/client-ui.jar"]
EXPOSE 8080