package com.mitoCode.beans.Ejercicio1Xml_V22;

import com.mitoCode.beans.Interfaces.IEquipo;

public class Jugador {

	private int id;
	private String nombre;
	private IEquipo equipo; // Cambio dinamico de equipo
	private Camiseta camiseta;

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

	public IEquipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	public Camiseta getCamiseta() {
		return this.camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}




}
