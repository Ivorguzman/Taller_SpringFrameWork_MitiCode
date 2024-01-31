package com.mitoCode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitoCode.beans.Marca;
import com.mitoCode.service.ServiceMarca;

public class App {
	public static void main(String[] args) {


		Marca marca = new Marca();
		marca.setId(2);
		marca.setNombre("Puma");

		@SuppressWarnings("resource")
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("beans.xml");
		ServiceMarca sm = (ServiceMarca) contenedor.getBean("serviceMarcaImpl");
		try{
			sm.registrar(marca);

		} catch(Exception ex){

			System.out.println(ex.getMessage());

		}

	}
}

/*
 * Se crea una variable llamada sm de tipo ServiceMarca, que es una
 * interfaz que define los métodos para acceder a la lógica de
 * negocio relacionada con las marcas.
 * 
 * Se asigna a la variable sm el resultado de invocar el método
 * getBean del objeto contenedor, que es una instancia de la clase
 * ApplicationContext de Spring2. Este método devuelve un objeto de
 * tipo Object que representa el bean
 * registrado con el nombre "serviceMarcaImpl" en el archivo de
 * configuración XML de Spring.
 * Se hace un casting o conversión de tipo del objeto devuelto por el
 * método getBean a ServiceMarca, usando el operador (ServiceMarca).
 * Esto es necesario porque el
 * método getBean devuelve un tipo genérico Object, pero se necesita
 * un tipo específico ServiceMarca para poder invocar sus métodos.
 * De esta forma, se obtiene una referencia al bean
 * "serviceMarcaImpl", que es una clase que implementa la interfaz
 * ServiceMarca y que contiene la lógica de negocio
 * concreta para las marcas. Este bean se configura en el archivo XML
 * de Spring con la etiqueta <bean> y el atributo
 * id="serviceMarcaImpl"3.
 * En resumen, esta línea de código permite obtener una instancia de
 * la clase que implementa la lógica de negocio para las marcas,
 * usando el mecanismo de inyección de
 * dependencias de Spring, que facilita la configuración y el
 * desacoplamiento de los componentes de la aplicación
 */
