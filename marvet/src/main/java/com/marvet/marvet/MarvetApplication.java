package com.marvet.marvet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MarvetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvetApplication.class, args);
	}
}