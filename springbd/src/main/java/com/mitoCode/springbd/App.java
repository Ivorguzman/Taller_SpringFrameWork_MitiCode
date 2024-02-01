package com.mitoCode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Equipo;
import com.mitoCode.beans.Jugador;
import com.mitoCode.beans.Marca;
import com.mitoCode.service.ServiceJugadorImpl;
import com.mitoCode.service.interfaz.ServiceJugador;


public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");


		ServiceJugador sm = appContex.getBean("serviceJugadorImpl", ServiceJugadorImpl.class);
		Marca mar3 = appContex.getBean("marca3", Marca.class);
		Equipo eq1 = appContex.getBean("equipo1", Equipo.class);
		Jugador jugador = appContex.getBean("jugador1", Jugador.class);


		try{
			sm.registrar(jugador);


		} catch(Exception ex){

			System.out.println(ex.getMessage());

		}

	}
}


