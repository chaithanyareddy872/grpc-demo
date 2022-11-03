FROM openjdk:11
EXPOSE 8081
ADD ./target/recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]