package com.exampleAutoWireAndQualifer_V20;

import com.mitoCode.beans.Interfaces.IEquipo;

public class Barcelona implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return "Equipo del Barcelona FC";
	}

}
