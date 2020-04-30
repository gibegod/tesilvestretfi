package com.unla.tesilvestretfi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TesilvestretfiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesilvestretfiApplication.class, args);
	}
}
