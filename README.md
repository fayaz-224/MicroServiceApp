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
> PART1 - https://www.youtube.com/watch?v=BLlEgtp2_i8 <br>
  PART2 - https://www.youtube.com/watch?v=EeQRAxXWDF4

### H2 console
> companyMs -> http://localhost:8081/h2-console <br>
  JobMs -> http://localhost:8082/h2-console <br>
  reviewMs -> http://localhost:8083/h2-console

# Eureka
> http://localhost:8761/

# DB
![image (1)](https://github.com/user-attachments/assets/088630ef-adeb-4b0d-8905-bf297d168ff9)

> postgres -> our database  <br>
> pgAdmin -> DB condole http://localhost:5050/

# Zipkin
![image3](https://github.com/user-attachments/assets/becdc68a-74d2-4984-997d-ebc624a404c5)

> Download zipkin jar and run - https://zipkin.io/pages/quickstart.html . we have it in our docker-compose  <br>
> http://localhost:9411/zipkin

# Config-Server
> If we are using config-server to load profiles from GIT <br>
> http://localhost:8080/application/dev

# Feign
> Its a declerative web client, to reduce boilerplate codes of restTemplate and bring load balancing capabilities.

![image1](https://github.com/user-attachments/assets/7ea1a4a1-03bf-41ba-814f-afbbe163e762)
![image2](https://github.com/user-attachments/assets/ea6d15f9-40d1-4a57-96cc-9928c2dfd484)

# RabitMQ
> To download rabbitMQ - https://www.rabbitmq.com/docs/download . Now, we have added in docker compose
> 
> http://localhost:15672  <br>
> guest/guest -> default <br>
> root/1234 -> custom. If facing connection issues with custom user, create custom user in rabitMq

# DOCKER
![image](https://github.com/user-attachments/assets/24926fa3-767b-48ae-9d77-f6e96979424a)

> docker compose up  -> to run all containers

> To build and push images to docker hub
> 1. ./mvnw spring-boot:build-image "-Dspring-boot.build- image.imageName=<IMAGE-NAME>" <br>
> 2. docker push IMAGE-NAME

IMAGE-NAME should be fully qualified name from dockerhub ie, username/imageName
