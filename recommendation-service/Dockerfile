FROM openjdk:11
EXPOSE 8095
ADD src/main/resources/application.properties recommendation-service/src/main/resources/application.properties
ADD target/recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","recommendation-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]