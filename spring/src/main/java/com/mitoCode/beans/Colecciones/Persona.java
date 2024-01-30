package com.mitoCode.beans.Colecciones;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;

	// Ijectadas con los valores de referenciados en memoria
	private Pais pais;



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



	public String getApodo() {
		return this.apodo;
	}



	public void setApodo(String apodo) {
		this.apodo = apodo;
	}



	public Pais getPais() {
		return this.pais;
	}



	public void setPais(Pais pais) {
		this.pais = pais;
	}


}
