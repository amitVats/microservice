# microservice
Microservices Tutorial

This tutorial contains an Demo Application based on Microservices architecture. The Application is divided into two service:

1. QuesionBank Service- This service is responsible for adding and retreiving questions into database. This service uses hibernate to interact with H2 database for different database operation.
2. Interview Service - This service consumes the QuestionBank service acting as a layer between business use case and database operations.

The interaction between the servies are handled by interviewprep-server(Eureka Server).

The Interview-zuul act as a gateway. A gateway is a single entry point into the system, used to handle requests by routing them to the corresponding service. This service is also responsible for securing our services.


