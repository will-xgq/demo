FROM openjdk:8
EXPOSE 8080
#LABEL
VOLUME /tmp
ADD /target/demo-0.0.1-SNAPSHOT.jar  /demo-0.0.1-SNAPSHOT.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]
