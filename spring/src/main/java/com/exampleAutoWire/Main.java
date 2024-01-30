package com.exampleAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto de Spring desde el archivo xml
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

		// Obtener el bean "circle" del contexto
		Circle circle = (Circle) context.getBean("circle");

		// Usar el método draw del bean
		circle.draw();
	}
}