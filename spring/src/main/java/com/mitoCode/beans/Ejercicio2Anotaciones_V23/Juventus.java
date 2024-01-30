package com.mitoCode.beans.Ejercicio2Anotaciones_V23;

import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;



@Component
public class Juventus implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return " Equipo del Juventus";
	}

}
