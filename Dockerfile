FROM java
EXPOSE 8081
ADD /target/devopssep22-0.0.1-SNAPSHOT.jar devopssep22.jar
ENTRYPOINT ["java", "-jar", "devopssep22.jar"]
