FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mproduits.jar
ENTRYPOINT ["java","-jar","/mproduits.jar"]
EXPOSE 9001