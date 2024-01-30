package com.mitoCode.beans.Colecciones;

import java.util.List;

public class Pais {
	

	private String nombrePais;
	private List<Ciudad> ciudades;


	public String getNombrePais() {
		return this.nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}




	public List<Ciudad> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

}
