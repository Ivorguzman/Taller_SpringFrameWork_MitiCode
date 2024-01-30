package com.mitoCode.beans.Ejercicio3JavaBase_V24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;

@Component
public class ElJugador {

	@Value("1")
	private int id;

	@Value("MitoCode")
	private String nombre;


	@Autowired
	@Qualifier("barcelona")
	private IEquipo equipo;


	@Autowired
	private LaCamiseta camiseta;



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

	public LaCamiseta getCamiseta() {
		return this.camiseta;
	}

	public void setCamiseta(LaCamiseta camiseta) {
		this.camiseta = camiseta;
	}




}
