package com.example.fittrack_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FittrackApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FittrackApiApplication.class, args);
	}

}
