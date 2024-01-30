package com.mitoCode.aplicaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mitoCode.beans.Ejercicio3JavaBase_V24.ElJugador;
import com.mitoCode.beans.Ejercicio3JavaBase_V24.EquipoBarcelona;

public class AppIjeccionBeanEjercicio3JavaBase_V24 {


	public static void main(String[] args) {

		

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);



		ElJugador jugador = ctx.getBean(ElJugador.class);



		// jugador.setEquipo(new EquipoJuventus());
		jugador.setEquipo(new EquipoBarcelona());


		/*
		 * switch (respuesta) {
		 * case 1:
		 * jugador.setEquipo(new EquipoBarcelona());
		 * break;
		 * 
		 * default:
		 * jugador.setEquipo(new EquipoJuventus());
		 * break;
		 * }
		 */


		System.out.println("Direccion en Memoria => " + jugador);

		System.out.println();

		System.out.println("hashCode() => " + jugador.hashCode());

		System.out.println("Id: " + jugador.getId());

		System.out.println("Nombre: " + jugador.getNombre());

		System.out.println("Equipo: " + jugador.getEquipo().mostrarNombreEquipo());

		System.out.println("Camiseta: " + jugador.getCamiseta());

		System.out.println("Numero: " + jugador.getCamiseta().getNumero());


	}

}






