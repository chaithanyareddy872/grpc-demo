FROM openjdk:11
EXPOSE 8085
ADD target/search-service-1.0-SNAPSHOT-jar-with-dependencies.jar search-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","search-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]