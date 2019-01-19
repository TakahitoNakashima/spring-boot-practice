package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.practice.config.SpringitProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringBootPracticeApplication {

	@Autowired
	private SpringitProperties springitProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Welcome message: " + springitProperties.getWelcomMsg());
		};
	}

}

