package com.mitoCode.aplicaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.AutoWire.Persona;

public class AppIjeccionBeanAutoWire {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor
		@SuppressWarnings("resource")
		// ApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanAutowire.xml");
		ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanAutowire.xml");


		// Instancias del Objeto persona
		// Persona persona01 = (Persona) appContex.getBean("persona");
		Persona persona = appContex.getBean("persona", Persona.class);

		System.out.println("hashCode() de persona01 => " + persona.hashCode());
		System.out.println("Direccion en Memoria de persona01 => " + persona);



		System.out.println();
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Apodo: " + persona.getApodo());
		System.out.println("Id: " + persona.getId());
		System.out.println("Pais: " + persona.getPais().getNombrePais());
		System.out.println("Ciudad: " + persona.getCiudad().getCiudadNombre());
		System.out.println();
		System.out.println();








	}



}














