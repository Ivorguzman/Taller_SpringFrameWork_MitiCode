package com.mitoCode.beans.Ejercicio3JavaBase_V24;

import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;



@Component
public class EquipoJuventus implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return " Equipo del Juventus";
	}

}
