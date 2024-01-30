package com.mitoCode.aplicaciones;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.InjeccionBeanAlias.Persona;




public class AppIjeccionBeanAnlias {

	public static void main(String[] args) {

		// LLamar contenedor de spring (beanContructor.xml)
		@SuppressWarnings("resource")
		ApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanAlias.xml");
		// ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beansIjeccionBeanAlias.xml");


		// Instancias del Objeto persona
		Persona persona01 = (Persona) appContex.getBean("miAliasPersona");


		System.out.println("Direccion en Memoria => " + persona01);
		System.out.println();
		System.out.println("hashCode() => " + persona01.hashCode());
		System.out.println("Nombre: " + persona01.getNombre());
		System.out.println("Apodo: " + persona01.getApodo());
		System.out.println("Id: " + persona01.getId());
		System.out.println("Pais: " + persona01.getPais().getNombrePais());
		System.out.println("Ciudad: " + persona01.getCiudad().getMiCiudad());


	}



}














