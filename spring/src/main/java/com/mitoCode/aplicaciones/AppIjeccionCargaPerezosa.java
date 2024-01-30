package com.mitoCode.aplicaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.CargaPerezosa.Persona;

public class AppIjeccionCargaPerezosa {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanCagaPerezosa.xml");

		// Instancias del Objeto persona
		Persona persona01 = appContex.getBean("persona", Persona.class);

		System.out.println("Direccion en Memoria => " + persona01);
		System.out.println("hashCode() => " + persona01.hashCode());
		System.out.println("Nombre: " + persona01.getNombre());
		System.out.println("Apodo: " + persona01.getApodo());
		System.out.println("Id: " + persona01.getId());


	}



}














