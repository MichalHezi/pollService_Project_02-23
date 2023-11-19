package com.pollService_Project_0223;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PollServiceProject0223Application {

	public static void main(String[] args) {
		SpringApplication.run(PollServiceProject0223Application.class, args);
	}

}
