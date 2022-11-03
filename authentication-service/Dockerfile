FROM openjdk:11
EXPOSE 8098
ADD target/authentication-service-1.0-SNAPSHOT-jar-with-dependencies.jar authentication-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","authentication-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]