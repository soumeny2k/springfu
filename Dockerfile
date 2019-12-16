FROM openjdk:8-jdk-alpine

COPY build/libs/springfu.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]