# MS FLOW
![Untitled](https://github.com/fayaz-224/MicroServiceApp/assets/85927635/14869ef7-8fe7-457d-8f4c-bbcba0c017ee)

# DTO
DTO (Data Transfer Object) is a design pattern used to transfer data between software application subsystems.

# Packaging
> to package our application use maven wrapper or download maven jar and install. <br>
> if not specified file type in <packaging>war</packaging>, default is .jar
>
> 1. to package = ./mvnw package
> 2. to run = java -jar .\target\companyms-0.0.1-SNAPSHOT.jar
> 3. to verify jar = jar -tf .\target\companyms-0.0.1-SNAPSHOT.jar

# LINKS
### Video ref
>PART1 - https://www.youtube.com/watch?v=BLlEgtp2_i8 <br>
 PART2 - https://www.youtube.com/watch?v=EeQRAxXWDF4

### H2 console
>companyMs -> http://localhost:8081/h2-console <br>
 JobMs -> http://localhost:8082/h2-console <br>
 reviewMs -> http://localhost:8083/h2-console

# Eureka
>http://localhost:8761/

# Zipkin


>Download zipkin jar and run - https://zipkin.io/pages/quickstart.html . we have it in our docker-compose  <br>
>http://localhost:9411/zipkin

# Config-Server
>If we are using config-server to load profiles from GIT <br>
> http://localhost:8080/application/dev

# RabitMQ
> To download rabbitMQ - https://www.rabbitmq.com/docs/download . Now, we have added in docker compose
> 
> http://localhost:15672  <br>
> guest/guest -> default <br>
> root/1234 -> ours

# DOCKER


> 1. ./mvnw spring-boot:build-image "-Dspring-boot.build- image.imageName=<IMAGE-NAME>" <br>
> 2. docker push IMAGE-NAME

IMAGE-NAME should be fully qualified name from dockerhub ie, username/imageName