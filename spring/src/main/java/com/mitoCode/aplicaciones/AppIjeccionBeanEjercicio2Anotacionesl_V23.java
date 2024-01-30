package com.mitoCode.aplicaciones;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Ejercicio2Anotaciones_V23.Barcelona;
import com.mitoCode.beans.Ejercicio2Anotaciones_V23.Jugador;
import com.mitoCode.beans.Ejercicio2Anotaciones_V23.Juventus;

public class AppIjeccionBeanEjercicio2Anotacionesl_V23 {

	public static void main(String[] args) {








		@SuppressWarnings("resource")
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("beansIjeccionBeanEjercicioAnotaciones_V23.xml");


		// Jugador jugador = contenedor.getBean("messi", Jugador.class);
		Jugador jugador = (Jugador) contenedor.getBean("jugador");


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


	}



}














