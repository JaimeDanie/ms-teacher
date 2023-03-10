FROM openjdk:17
EXPOSE 9001
ADD ./target/teacher-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]