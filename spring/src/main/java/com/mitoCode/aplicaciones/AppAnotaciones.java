package com.mitoCode.aplicaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mitoCode.beans.anotaciones.AppConfig;
import com.mitoCode.beans.anotaciones.AppConfig_2;
import com.mitoCode.beans.anotaciones.AppConfig_2.AppConfig_3;
import com.mitoCode.beans.anotaciones.EstrellaBelen;
import com.mitoCode.beans.anotaciones.Mundo;

public class AppAnotaciones {

	public static void main(String[] args) {

		/*
		 ****** Forma Lenguaje Java:*****
		 * Mundo miMundo = new Mundo() ;
		 * miMundo.getSaludo();
		 * 
		 */

		@SuppressWarnings("resource")
		// *********************** CONTENEDOR XML***********************************
		/*
		 * ApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");
		 * // ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");
		 */
		// ************************* CONTENEDOR XML **********************************




		// *********************** PRIMERA FORMA DE HACERLO : AnnotationConfigApplicationContext() ***********************************
		// Create a new AnnotationConfigApplicationContext, deriving bean definitionsfrom the given component classes
		// and automatically refreshing the context
		// AppConfig.class , AppConfig_2.class, AppConfig_3.class==> Clases que contiene la definición de los beans
		// // ApplicationContext appContex = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig_2.class, AppConfig_3.class);
		// *********************** AnnotationConfigApplicationContext() ***********************************








		// *********************** SEGUNDA FORMA DE HACERLO : AnnotationConfigApplicationContext() ***********************************
		// Create a new AnnotationConfigApplicationContext, deriving bean definitionsfrom the given component classes
		// and automatically refreshing the context
		// AppConfig.class , AppConfig_2.class, AppConfig_3.class==> Clases que contiene la definición de los beans
		AnnotationConfigApplicationContext appContex = new AnnotationConfigApplicationContext();
		appContex.register(AppConfig.class);
		appContex.register(AppConfig_2.class);
		appContex.register(AppConfig_3.class);
		// Load or refresh the persistent representation of the configuration, whichmight be from
		// Java-based configuration, an XML file, a properties file, arelational database schema, or some other format.
		appContex.refresh();
		// *********************** SEGUNDA FORMA DE HACERLO: AnnotationConfigApplicationContext() ***********************************







		// *********************** PATRON FACTORIA (PASAMOS id DEVUELBE instancia) ***********************************
		// Mundo miMundo = appContex.getBean("mundoBean", Mundo.class);
		Mundo miMundo = (Mundo) appContex.getBean("mundoBean"); // mundoBean => nombre del metodo con la anotacion @Bean en la clase AppComfig.java
		Mundo miMundo_2 = (Mundo) appContex.getBean("mundoBean");// mundoBean => nombre del metodo con la anotacion @Bean en la clase AppComfig.java

		Mundo miMundo_3 = (Mundo) appContex.getBean("mundoBean_2");// mundoBean_2 => nombre del metodo con la anotacion @Bean en la clase AppComfig_2.java
		Mundo miMundo_4 = (Mundo) appContex.getBean("mundoBean_2");// mundoBean _2 => nombre del metodocon la anotacion @Bean en la clase AppComfig_2.java

		EstrellaBelen miEstrella_1 = (EstrellaBelen) appContex.getBean("estrellaBean_1");// => estrellaBean_1 nombre del metodo con la anotacion @Bean en la clase
																							// AppComfig_2.

		EstrellaBelen miEstrella_2 = (EstrellaBelen) appContex.getBean("estrellaBean_1");// => estrellaBean_1 nombre del metodocon la anotacion @Bean en la clase
																							// AppComfig_2.java


		System.out.println();
		System.out.println("hashCode() => " + miMundo.hashCode());
		System.out.println(miMundo.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miMundo_2.hashCode());
		System.out.println(miMundo_2.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miMundo_3.hashCode());
		System.out.println(miMundo_3.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miMundo_4.hashCode());
		System.out.println(miMundo_4.getSaludo());
		System.out.println();

		System.out.println("hashCode() => " + miEstrella_1.hashCode());
		System.out.println(miEstrella_1.getSaludo_2());
		System.out.println();
		System.out.println("hashCode() => " + miEstrella_2.hashCode());




		System.out.println(miEstrella_2.getSaludo_2());
		((AbstractApplicationContext) appContex).close();
	}



}














