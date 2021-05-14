FROM openjdk:11-jre
EXPOSE 8080
RUN mkdir -p /app/bin
COPY ./target/opentracing-app-b.jar /app/bin
CMD java -jar /app/bin/opentracing-app-b.jar