package com.mitoCode.aplicaciones;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Ejercicio1Xml_V22.Barcelona;
import com.mitoCode.beans.Ejercicio1Xml_V22.Jugador;
import com.mitoCode.beans.Ejercicio1Xml_V22.Juventus;

public class AppIjeccionBeanEjercicio1Xml_V22 {

	public static void main(String[] args) {





		// 01 LLamar contenedor de spring (beanContructor.xml)



		@SuppressWarnings("resource")
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanEjercicioXml_V22.xml");


		// Jugador jugador = contenedor.getBean("messi", Jugador.class);
		Jugador jugador = (Jugador) contenedor.getBean("jugador1");


		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Eliga uno de los equipo:\n 1- Barcelona \n 2- Juventus");
		int respuesta = teclado.nextInt();


		switch (respuesta) {
			case 1:
				jugador.setEquipo(new Barcelona());
				break;

			default:
				jugador.setEquipo(new Juventus());
				break;
		}


		System.out.println("Direccion en Memoria => " + jugador);

		System.out.println();

		System.out.println("hashCode() => " + jugador.hashCode());

		System.out.println("Id: " + jugador.getId());

		System.out.println("Nombre: " + jugador.getNombre());

		System.out.println("Equipo: " + jugador.getEquipo().mostrarNombreEquipo());

		System.out.println("Camiseta: " + jugador.getCamiseta());

		System.out.println("Numero: " + jugador.getCamiseta().getNumero());












		/*
		 * # OPCION MUY POCO ELEGANTE Y MUY INEFICAZ
		 * 
		 * @SuppressWarnings("resource")
		 * ApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanEjercicioXml_V22.xml");
		 * Jugador jugador = (Jugador) contenedor.getBean("jugador1");
		 * Jugador jugador2 = (Jugador) contenedor.getBean("jugador2");
		 *
		 * switch (respuesta) {
		 * case 1:
		 * System.out.println("Direccion en Memoria => " + jugador);
		 * System.out.println();
		 * System.out.println("hashCode() => " + jugador.hashCode());
		 * System.out.println("Id: " + jugador.getId());
		 * System.out.println("Nombre: " + jugador.getNombre());
		 * System.out.println("Equipo: " + jugador.getEquipo().mostrarNombreEquipo());
		 * System.out.println("Camiseta: " + jugador.getCamiseta());
		 * System.out.println("Numero: " + jugador.getCamiseta().getNumero());
		 * break;
		 * case 2:
		 * System.out.println("Direccion en Memoria => " + jugador2);
		 * System.out.println();
		 * System.out.println("hashCode() => " + jugador2.hashCode());
		 * System.out.println("Id: " + jugador2.getId());
		 * System.out.println("Nombre: " + jugador2.getNombre());
		 * System.out.println("Equipo: " + jugador2.getEquipo().mostrarNombreEquipo());
		 * System.out.println("Camiseta: " + jugador2.getCamiseta());
		 * System.out.println("Numero: " + jugador2.getCamiseta().getNumero());
		 * break;
		 * default:
		 * }
		 */

	}



}














