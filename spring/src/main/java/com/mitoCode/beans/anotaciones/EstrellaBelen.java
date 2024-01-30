package com.mitoCode.beans.anotaciones;

import org.springframework.beans.factory.annotation.Value;

public class EstrellaBelen {


	@Value("Hola Estrella de Belen Utilizando Anotaciones (@Value)")
	private String saludo2;


	public void setSaludo_2(String saludo_2) {
		this.saludo2 = saludo_2;
	}

	public String getSaludo_2() {
		return this.saludo2;
	}


}
