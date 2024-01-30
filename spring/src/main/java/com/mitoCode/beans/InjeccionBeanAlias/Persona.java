package com.mitoCode.beans.InjeccionBeanAlias;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;

	// Ijectadas con valores referenciados
	private Pais pais;
	private Ciudad ciudad;



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

	public Ciudad getCiudad() {
		return this.ciudad;
	}



	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


}
