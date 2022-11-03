FROM openjdk:11
EXPOSE 8095
ADD src/main/resources/application.properties class-booking-service/src/main/resources/application.properties
ADD target/class-booking-service-1.0-SNAPSHOT-jar-with-dependencies.jar class-booking-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","class-booking-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]