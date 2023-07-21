FROM openjdk:11
EXPOSE 5200
ADD target/cicd-demo4.jar cicd-demo4.jar
ENTRYPOINT ["java","-jar","/cicd-demo4.jar"]