package com.example.practice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

	/**
	 * This is our welcome message!
	 */

	private String welcomeMsg = "Hello, World!";

	public String getWelcomMsg() {
		return welcomeMsg;
	}

	public void setWelcomMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

}
