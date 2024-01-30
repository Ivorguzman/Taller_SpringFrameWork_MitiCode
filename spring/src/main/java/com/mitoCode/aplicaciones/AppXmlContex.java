package com.mitoCode.aplicaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.MetodoSeter.xml.EstrellaBelen;
import com.mitoCode.beans.MetodoSeter.xml.Mundo;



public class AppXmlContex {

	public static void main(String[] args) {

		/*
		 ****** Forma Lenguaje Java:*****
		 * Mundo miMundo = new Mundo() ;
		 * miMundo.getSaludo();
		 * 
		 */

		@SuppressWarnings("resource")
		// *********************** CONTENEDOR XML***********************************

		ApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");
		// ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");

		// ************************* CONTENEDOR XML **********************************





		// *********************** PATRON FACTORIA (PASAMOS id DEVUELBE instancia) ***********************************
		// Mundo miMundo = appContex.getBean("mundoBean", Mundo.class);

		Mundo miMundo = (Mundo) appContex.getBean("mundoBean"); // mundoBean => nombre del id del bean en el bean.xml
		Mundo miMundo_2 = (Mundo) appContex.getBean("mundoBean");// mundoBean => nombre del id del bean en el bean.xml
		Mundo miMundo_3 = (Mundo) appContex.getBean("mundoBean_2");
		Mundo miMundo_4 = (Mundo) appContex.getBean("mundoBean_2");



		EstrellaBelen miEstrella_1 = (EstrellaBelen) appContex.getBean("estrellaBean_1");
		EstrellaBelen miEstrella_2 = (EstrellaBelen) appContex.getBean("estrellaBean_1");




		System.out.println();
		System.out.println("hashCode() => " + miMundo.hashCode());
		System.out.println(miMundo.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miMundo_2.hashCode());
		System.out.println(miMundo_2.getSaludo());
		System.out.println();

		System.out.println();
		System.out.println("hashCode() => " + miMundo_3.hashCode());
		System.out.println(miMundo_3.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miMundo_4.hashCode());
		System.out.println(miMundo_4.getSaludo());
		System.out.println();





		System.out.println("hashCode() => " + miEstrella_1.hashCode());
		System.out.println(miEstrella_1.getSaludo2());
		System.out.println();


		System.out.println("hashCode() => " + miEstrella_2.hashCode());
		System.out.println(miEstrella_2.getSaludo2());



		((AbstractApplicationContext) appContex).close();
	}



}














