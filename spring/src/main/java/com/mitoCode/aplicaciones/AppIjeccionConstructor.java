package com.mitoCode.aplicaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.InjeccionConConstructor.Persona;

public class AppIjeccionConstructor {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)
		@SuppressWarnings("resource")
		// ApplicationContext appContex = new ClassPathXmlApplicationContext("beanConstructor.xml");
		ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansConstructor.xml");

		// Instancias del Objeto persona
		Persona persona01 = appContex.getBean("persona", Persona.class);

		System.out.println("Direccion en Memoria => " + persona01);
		System.out.println("hashCode() => " + persona01.hashCode());
		System.out.println("Nombre: " + persona01.getNombre());
		System.out.println("Apodo: " + persona01.getApodo());
		System.out.println("Id: " + persona01.getId());


	}



}














