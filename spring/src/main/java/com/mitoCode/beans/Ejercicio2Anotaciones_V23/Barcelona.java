package com.mitoCode.beans.Ejercicio2Anotaciones_V23;

import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;


@Component("barcelona")
public class Barcelona implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return "Equipo del Barcelona FC";
	}

}
