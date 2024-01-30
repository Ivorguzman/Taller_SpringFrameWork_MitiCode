package com.mitoCode.beans.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Indicates that a class declares one or more @Bean methods
public class AppConfig {

	@Bean // Indicates that a method produces a bean to be managed by the Spring container
	public Mundo mundoBean() {
		return new Mundo();
	}

}
