package com.mitoCode.beans.Ejercicio2Anotaciones_V23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Camiseta {
	private int id;

	@Value("10")
	private int numero;

	@Autowired
	private Marca nombre;



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

	public Marca getNombre() {
		return this.nombre;
	}

	public void setNombre(Marca nombre) {
		this.nombre = nombre;
	}





}
