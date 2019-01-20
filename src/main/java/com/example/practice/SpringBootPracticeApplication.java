package com.example.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.example.practice.config.SpringitProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringBootPracticeApplication {

	@Autowired
	private SpringitProperties springitProperties;

	@Autowired
	private ApplicationContext applicationContext;


	private static final Logger log = LoggerFactory.getLogger(SpringBootPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}



	@Bean
	@Profile("dev")
	CommandLineRunner runner() {
		return args -> {
			log.error("CommandLineRunner.run();");
			log.warn("CommandLineRunner.run();");
			log.info("CommandLineRunner.run();");
			log.debug("CommandLineRunner.run();");
			log.trace("CommandLineRunner.run();");

//			System.out.println("Welcome message: " + springitProperties.getWelcomMsg());
//			System.out.println("This is something that we would only do in dev");
//			System.out.println("Printing out all teh bean names in the application context.");
//			System.out.println("-----------------------------------------------------------");
//			String[] beans = applicationContext.getBeanDefinitionNames();
//			Arrays.sort(beans);
//			for(String bean: beans) {
//				System.out.println(bean);
//			}
		};
	}

}

