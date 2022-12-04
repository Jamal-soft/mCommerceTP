FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mpaiment.jar
ENTRYPOINT ["java","-jar","/mpaiment.jar"]
EXPOSE 9003