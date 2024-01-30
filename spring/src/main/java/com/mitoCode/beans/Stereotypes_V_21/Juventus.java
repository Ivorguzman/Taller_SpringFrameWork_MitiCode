package com.mitoCode.beans.Stereotypes_V_21;

import com.mitoCode.beans.Interfaces.IEquipo;


// @Component // = <bean> id="juventus" class=com.mitoCode.Stereotypes_V_21.Juventus/>
public class Juventus implements IEquipo {

	@Override public String mostrarNombreEquipo() {
		return "Equipo del Juventus";
	}

}
