package com.mitoCode.beans.Stereotypes_V_21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mitoCode.beans.Interfaces.IEquipo;


// @Service("messi") // = <bean> id="messi" class=com.mitoCode.Stereotypes_V_21.Jugador/>
// @Controller("messi") // = <bean> id="messi" class=com.mitoCode.Stereotypes_V_21.Jugador/>
// @Repository("messi") // = <bean> id="messi" class=com.mitoCode.Stereotypes_V_21.Jugador/>
@Component("messi") // = <bean> id="messi" class=com.mitoCode.Stereotypes_V_21.Jugador/>
public class Jugador {

	@Value("10") // <property name="numero" value="10"></property>
	private int numero;

	@Value("LEONEL MESSI") // <property name="nombre" value="LEONEL MESSI"></property>
	private String nombre;

	// @Qualifier("juventusCualificado")
	@Autowired // Hace referncia Por defecto (byType) a: <bean id="{juventus | barcelona}" ...></bean> //
	private IEquipo equipo;




	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int suNumero) {
		this.numero = suNumero;
	}




	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String suNombre) {
		this.nombre = suNombre;
	}




	public IEquipo getEquipo() {
		return this.equipo;
	}

	// @Required //
	public void setEquipo(IEquipo suEquipo) {
		this.equipo = suEquipo;
	}




}
