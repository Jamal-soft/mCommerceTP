FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mcommandes.jar
ENTRYPOINT ["java","-jar","/mcommandes.jar"]
EXPOSE 9002