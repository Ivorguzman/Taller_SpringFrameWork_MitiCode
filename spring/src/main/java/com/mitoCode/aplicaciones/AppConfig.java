package com.mitoCode.aplicaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mitoCode.beans.Ejercicio3JavaBase_V24.ElJugador;
import com.mitoCode.beans.Ejercicio3JavaBase_V24.EquipoBarcelona;
import com.mitoCode.beans.Ejercicio3JavaBase_V24.EquipoJuventus;
import com.mitoCode.beans.Ejercicio3JavaBase_V24.LaCamiseta;
import com.mitoCode.beans.Ejercicio3JavaBase_V24.LaMarca;

@Configuration
public class AppConfig { // Seria el simil al rchivo cotenedor xml



	@Bean // <bean id="jugador" class="com.mitoCode.beans.Ejercicio3JavaBase_V24.Jugador"> ....</bean>
	public ElJugador jugador() { // El nombre del metodo es el id del bean (jugador() ==> id= "jugador")
		return new ElJugador();
	}



	@Bean // <bean id="barcelona" class="com.mitoCode.beans.Ejercicio3JavaBase_V24.Barcelona"> ....</bean>
	public EquipoBarcelona barcelona() { // El nombre del metodo es el id del bean (barcelona() ==> id= "barcelona")
		return new EquipoBarcelona();
	}



	@Bean  // <bean id="barcelona" class="com.mitoCode.beans.Ejercicio3JavaBase_V24.Juventus"> ....</bean>
	public EquipoJuventus juventus() { // El nombre del metodo es el id del bean (juventus() ==> id= "juventus")
		return new EquipoJuventus();
	}




	@Bean  // <bean id="camiseta" class="com.mitoCode.beans.Ejercicio3JavaBase_V24.Camiseta"> ....</bean>
	public LaCamiseta camiseta() { // El nombre del metodo es el id del bean (camiseta() ==> id= "camiseta")
		return new LaCamiseta();
	}



	@Bean  // <bean id="marca" class="com.mitoCode.beans.Ejercicio3JavaBase_V24.Marca"> ....</bean>
	public LaMarca marca() { // El nombre del metodo es el id del bean (marca() ==> id= "marca")
		return new LaMarca();
	}

}
