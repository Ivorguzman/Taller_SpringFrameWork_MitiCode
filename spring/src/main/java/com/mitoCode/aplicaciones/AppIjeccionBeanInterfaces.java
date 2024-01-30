package com.mitoCode.aplicaciones;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.ClasesInterfaces_V18.Barcelona;
import com.mitoCode.beans.ClasesInterfaces_V18.Jugador;
import com.mitoCode.beans.Interfaces.IEquipo;

public class AppIjeccionBeanInterfaces {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanInterfaces.xml");
		Jugador jugador = appContex.getBean("messi", Jugador.class);


		IEquipo miEquipo = appContex.getBean("barcelona", Barcelona.class);
		// IEquipo equipo2 = appContex.getBean("juventus", Juventus.class);



		System.out.println("Direccion en Memoria => " + jugador);
		System.out.println();
		System.out.println("hashCode() => " + jugador.hashCode());
		System.out.println("Nombre: " + jugador.getNombre());
		System.out.println("Numero: " + jugador.getNumero());

		System.out.println("Equipo :por medio del atributo {ref=??? | @AutoWire} en el xml injectamos el valor: " + jugador.getEquipo().mostrarNombreEquipo());


		System.out.println("Equipo por medio del [getBean(...)] Impl. Interfas Barcelona injectamos el valor: " + miEquipo.mostrarNombreEquipo());

		// System.out.println("Equipo por medio del [getBean(...)] Impl. Interfas Juventus injectamos el valor: " + equipo2.mostrarNombreEquipo());



	}



}














