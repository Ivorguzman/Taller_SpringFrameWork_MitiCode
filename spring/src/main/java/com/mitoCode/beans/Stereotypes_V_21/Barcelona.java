package com.mitoCode.beans.Stereotypes_V_21;

import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;


@Component
public class Barcelona implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return "quipo del Barcelona FC";
	}

}
