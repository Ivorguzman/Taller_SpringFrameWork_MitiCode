package com.mitoCode.beans.Ejercicio2Anotaciones_V23;

import org.springframework.stereotype.Component;

@Component
public class Marca {

	private int id;
	private String nombre;



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
