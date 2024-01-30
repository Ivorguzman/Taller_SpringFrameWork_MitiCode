package com.mitoCode.aplicaciones;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exampleAutoWireRequiredAndQualifer_V19_20.Jugador;

public class AppIjeccionBeanAutoWireAndQualifier {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)


		// ClassPathXmlApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanAutoWireRequiredAndQualifier.xml");
		@SuppressWarnings("resource")
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanAutoWireRequiredAndQualifier.xml");
		
		
		//Jugador jugador = contenedor.getBean("messi", Jugador.class);
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














