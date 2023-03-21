# Steps to push docker image in docker hub
1. Build springboot application
   - Go to maven and select Lifecycle
        - select clean and package
		- run maven build (jar file will be created)
		
2. Create Docker file
   - Define all the instructions
 
3. Build docker image from Dockerfile
   - docker build -t <docker-image-name> <Dockerfile-location>
   
4. Run docker image in docker container
   - docker run -p <host-port>:<container-port> <docker-image-name>

5. Push docker image to docker hub
   - First login to docker hub using credentials
    - docker login -> provide password

6. Associate docker-image with the repository
   - docker tag <docker-image-name> <docker-hub-id>/<repository-name>:<tag-name>

7. Push the docker image to docker-hub  
   - docker push <docker-hub-id>/<docker-image-name>:<tag-name> 
   
8. Pull docker-hub image to docker-container
   - docker pull <docker-hub-id>/<docker-image-name>:<tag-name>
   
