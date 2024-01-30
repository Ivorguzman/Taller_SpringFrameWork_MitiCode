package com.mitoCode.beans.InjeccionBeanAnidados;

public class Pais {
	
	private String miPais;

	
	public String getNombrePais() {
		return this.miPais;
	}

	public void setNombrePais(String nombrePais) {
		System.out.println("String nombrePais: (Injección de la dependencia) ==> " + nombrePais);
		this.miPais = nombrePais;
	}


}
