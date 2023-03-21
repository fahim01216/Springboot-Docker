package com.codewithfahim.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

    // Build spring boot application
    //  - Go to maven and select Lifecycle
    //    - select clean and package
    //	   - run maven build (jar file will be created)

	// create Dockerfile and define all the instructions

	// command to build docker image
	// docker build -t spring boot-docker:0.1.release .

	// command to run docker image
	// docker run -p <host-port>:<container-port> <image-name>

	// command to check the status of docker image i.e which images are running
	// docker ps

	// command to run the docker image in detached / background mode
	// docker run -p <host-port>:<container-port> -d <image-name>

	// command to check the logs
	// docker logs -f

	// command to stop the docker container image
	// docker stop <id>

	// command to associate docker-image with the repository
	// docker tag springboot-docker fahim01216/<repository-name>:<tag>

	// command to push the docker image to docker-hub
	// docker push <docker-hub-id>/<docker-image>:<tag>

	// command to pull docker-hub image to docker-container
	// docker pull <docker-id>/<docker-image>

}
