FROM java:8
LABEL maintainer=“kotvitz17@gmail.com”
WORKDIR /app
COPY target/myrestapi-0.0.1-SNAPSHOT.jar /app/myrestapi-app.jar
ENTRYPOINT ["java","-jar","myrestapi-app.jar"]