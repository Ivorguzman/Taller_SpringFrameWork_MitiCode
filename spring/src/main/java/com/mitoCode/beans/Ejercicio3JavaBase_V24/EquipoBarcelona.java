package com.mitoCode.beans.Ejercicio3JavaBase_V24;

import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;


@Component("barcelona")
public class EquipoBarcelona implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return "Equipo del Barcelona FC";
	}

}
