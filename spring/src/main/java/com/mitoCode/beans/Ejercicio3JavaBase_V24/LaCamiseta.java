package com.mitoCode.beans.Ejercicio3JavaBase_V24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class LaCamiseta {
	private int id;

	@Value("10")
	private int numero;

	@Autowired
	private LaMarca nombre;



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LaMarca getNombre() {
		return this.nombre;
	}

	public void setNombre(LaMarca nombre) {
		this.nombre = nombre;
	}





}
