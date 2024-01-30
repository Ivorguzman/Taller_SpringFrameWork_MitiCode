package com.mitoCode.aplicaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Stereotypes_V_21.Jugador;

public class AppIjeccionBeanStereotypes {

	public static void main(String[] args) {

		/*
		 * //***** EJEMPLO DE FORMA TRADICIONAL SIN SPRING FRAMEWORK *****
		 * 
		 * // paso 1
		 * Jugador jugador = new Jugador(); // bean "messi
		 * Juventus equipo_J = new Juventus();
		 * Barcelona equipo_B = new Barcelona();
		 * 
		 * 
		 * // paso2
		 * 
		 * // jugador.;
		 * jugador.setNombre("Messi");
		 * jugador.setNumero(10);
		 * 
		 * jugador.setEquipo(equipo_B);
		 * // jugador.setEquipo(equipo_J);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // paso2
		 * System.out.println("Direccion en Memoria => " + jugador);
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("hashCode() => " + jugador.hashCode());
		 * 
		 * System.out.println("Nombre: " + jugador.getNombre());
		 * 
		 * System.out.println("Numero: " + jugador.getNumero());
		 * 
		 * System.out.println("Equipo Referncia en memoria : " + jugador.getEquipo());
		 * System.out.println("Equipo: " + jugador.getEquipo().mostrarNombreEquipo());
		 * 
		 * 
		 * //***** FIN EJEMPLO DE FORMA TRADICIONAL SIN SPRING FRAMEWORK *****
		 */




		// ****** USANDO EL SPRING FRAMEWORK ******


		// 01 LLamar contenedor de spring (beanContructor.xml)


		// ClassPathXmlApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanAutoWireRequiredAndQualifier.xml");
		@SuppressWarnings("resource")
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanStereotypes.xml");


		// Jugador jugador = contenedor.getBean("messi", Jugador.class);
		Jugador jugador = (Jugador) contenedor.getBean("messi");


		// IEquipo miEquipo = contenedor.getBean("barcelona", Barcelona.class);
		// IEquipo miEquipo = (IEquipo) contenedor.getBean("barcelona");

		// IEquipo miEquipo = contenedor.getBean("juventus", Juventus.class);
		// IEquipo equipo2 = (IEquipo) contenedor.getBean("juventus");



		System.out.println("Direccion en Memoria => " + jugador);

		System.out.println();

		System.out.println("hashCode() => " + jugador.hashCode());

		System.out.println("Nombre: " + jugador.getNombre());

		System.out.println("Numero: " + jugador.getNumero());


		System.out.println("Equipo :por medio del atributo {ref=??? | @AutoWire} en el xml injectamos el valor: " + jugador.getEquipo().mostrarNombreEquipo());


		// System.out.println("Equipo :por medio del atributo {ref=??? | @AutoWire} en el xml injectamos el valor: " + miEquipo.mostrarNombreEquipo());

		// System.out.println("Equipo por medio del [getBean(...)] Impl. Interfas Juventus injectamos el valor: " + equipo2.mostrarNombreEquipo());







	}



}














