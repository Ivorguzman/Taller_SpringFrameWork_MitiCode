package com.mitoCode.beans.InjeccionConConstructor;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;



	// Primer Contructor
	public Persona(int id, String nombre, String apodo) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}



	// Segundo Contructor
	public Persona(int id) {
		this.id = id;
	}



	// Tercer Contructor
	public Persona(String apodo) {
		this.apodo = apodo;
	}

	


	public int getId() {
		return this.id;
	}





	public String getNombre() {
		return this.nombre;
	}



	public String getApodo() {
		return this.apodo;
	}





}
