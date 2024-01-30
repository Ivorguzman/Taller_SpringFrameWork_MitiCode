package com.mitoCode.beans.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_2 {

	@Bean public Mundo mundoBean_2() {
		return new Mundo();
	}



	@Configuration
	public class AppConfig_3 {

		@Bean public EstrellaBelen estrellaBean_1() {
			return new EstrellaBelen();
		}



	}
}
