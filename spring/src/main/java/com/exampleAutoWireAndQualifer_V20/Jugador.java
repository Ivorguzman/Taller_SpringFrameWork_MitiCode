package com.exampleAutoWireAndQualifer_V20;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitoCode.beans.Interfaces.IEquipo;



public class Jugador {

	private int numero;
	private String nombre;



	@Autowired() // Hace referncia Por defecto (byType) a: <bean id="{juventus | barcelona}" ...></bean> //
	private IEquipo equipo;


	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int suNumero) {
		this.numero = suNumero;
	}



	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String suNombre) {
		this.nombre = suNombre;
	}



	public IEquipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(IEquipo suEquipo) {
		this.equipo = suEquipo;
	}




}
