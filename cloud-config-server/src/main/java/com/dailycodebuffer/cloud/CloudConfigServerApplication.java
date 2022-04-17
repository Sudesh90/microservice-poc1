package com.dailycodebuffer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigServerApplication {

	//https://bit.ly/3nHvg71 (application.yml)
	//Event Driven Architectural (EDA) Design Pattern - RabitMQ/Kafka Message Broker
	//Pull/Push base design pattern
	/* config to talk to all the microservices
		application:
		name: USER-SERVICE
		zipkin:
		base-url: http://127.0.0.1:9411/
		base-url: http://127.0.0.1:9411/
		limits-service:
		  minimum: 99
		  maximum: 999
		#Config Server Design Patter - Centralized Configuration
	 */
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}
