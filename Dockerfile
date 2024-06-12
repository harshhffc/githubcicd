FROM openjdk:17-jdk

WORKDIR /app
COPY build/libs/githubcicd-0.0.1-SNAPSHOT.war /app/springdemo.war
EXPOSE 8080
CMD ["java","-jar","springdemo.war"]