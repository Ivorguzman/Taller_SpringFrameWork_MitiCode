package com.exampleAutoWireRequiredAndQualifer_V19_20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mitoCode.beans.Interfaces.IEquipo;



public class Jugador {

	private int numero;
	private String nombre;

	@Autowired // Hace referncia Por defecto (byType) a: <bean id="{juventus | barcelona}" ...></bean> //
	@Qualifier("juventusCualificado") // funciona declarandolo solo el la propiedad no en el seter
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

	// @Required // funciona declarandolo solo el en el seter no en la propidad
	public void setEquipo(IEquipo suEquipo) {
		this.equipo = suEquipo;
	}




}
