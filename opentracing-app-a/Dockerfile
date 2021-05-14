FROM openjdk:11-jre
EXPOSE 8080
RUN mkdir -p /app/bin
COPY ./target/opentracing-app-a.jar /app/bin
CMD java -jar /app/bin/opentracing-app-a.jar