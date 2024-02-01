package com.mitoCode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Jugador;
import com.mitoCode.service.ServiceJugador;


public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");
		
		ServiceJugador sm = (ServiceJugador) appContex.getBean("serviceJugadorImpl");

		// Marca mar3 = (Marca) appContex.getBean("marca3");
		// Equipo eq1 = (Equipo) appContex.getBean("equipo1");
		Jugador jugador = (Jugador) appContex.getBean("jugador1");



		try{
			sm.registrar(jugador);


		} catch(Exception ex){

			System.out.println(ex.getMessage());

		}

	}
}


