package com.mitoCode.beans.anotaciones;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	@Value("Hola Mundo Utilizando Anotaciones (@Value)")
	private String saludo;

	public String getSaludo() {
		return this.saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}



}
