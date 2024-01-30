package com.mitoCode.aplicaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Colecciones.Ciudad;
import com.mitoCode.beans.Colecciones.Persona;

public class AppIjeccionBeanColecciones {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)
		@SuppressWarnings("resource")
		ApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanColecciones.xml");
		// ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanColecciones.xml");


		// Instancias del Objeto persona
		Persona persona01 = (Persona) appContex.getBean("miAliasPersona");

		System.out.println("hashCode() de persona01 => " + persona01.hashCode());
		System.out.println("Direccion en Memoria de persona01 => " + persona01);


		for (Ciudad nombreCiudades : persona01.getPais().getCiudades()){


			System.out.println();
			System.out.println("Nombre: " + persona01.getNombre());
			System.out.println("Apodo: " + persona01.getApodo());
			System.out.println("Id: " + persona01.getId());
			System.out.println("Pais: " + persona01.getPais().getNombrePais());
			System.out.println("Ciudad: " + nombreCiudades.getMiCiudad());
			System.out.println();
			System.out.println();

		}






	}



}














