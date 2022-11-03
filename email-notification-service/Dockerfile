FROM openjdk:11
EXPOSE 9009
ADD src/main/resources/SenderEmailInfo/EmailIdPassword.txt email-notification-service/src/main/resources/SenderEmailInfo/EmailIdPassword.txt
ADD src/main/resources/application.properties email-notification-service/src/main/resources/application.properties
ADD target/Noty5-1.0-SNAPSHOT-jar-with-dependencies.jar Noty5-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","Noty5-1.0-SNAPSHOT-jar-with-dependencies.jar"]