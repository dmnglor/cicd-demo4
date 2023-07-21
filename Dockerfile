FROM openjdk:11
EXPOSE 5200
ADD target/scicd-demo.jar cicd-demo.jar
ENTRYPOINT ["java","-jar","/cicd.jar"]