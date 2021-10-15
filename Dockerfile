FROM openjdk:8
EXPOSE 8080
#LABEL
WORKDIR /home/java
ADD demo-0.0.1-SNAPSHOT.jar 
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
