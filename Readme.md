# Steps to follow after making code changes to Spring Boot

1. Run maven clean: clears up existing jar
2. Run maven package: generates a new jar
3. Run ```docker-compose build```: to build the docker image using the jar
4. Run ```docker-compose down```: to shutdown existing running docker instances.
5. Run ```docker-compose up -d```: to run docker container.