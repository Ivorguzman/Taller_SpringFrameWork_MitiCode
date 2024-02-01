package com.mitoCode.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitoCode.beans.Marca;
import com.mitoCode.dao.DAOMarca;

@Repository
public class DAOMarcaImpl implements DAOMarca {

	/*
	 * DataSource es una interfaz que representa una fuente de datos, es
	 * decir una fábrica de conexiones a una base de datos física.
	 * Esta interfaz se usa para obtener objetos de tipo Connection
	 * que son los que te permiten ejecutar consultas SQL y manipular los
	 * datos de la base de datos.
	 */
	@Autowired
	private DataSource datosConeccion;
	// Creación consulta sql
	String sql = "INSERT INTO marca(id,nombre) values(?,?)";


	@Override // Iplementacion de la Interfaz
	public void registrar(Marca marca) throws Exception {

		System.out.println(marca.getId());
		System.out.println(marca.getNombre());

		try (Connection conn = this.datosConeccion.getConnection(); PreparedStatement ps = conn.prepareStatement(this.sql)){
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
		} catch(Exception ex){
			throw ex;
		}
	}

}

/*
 * @Override
 * EXPLICACION DEL METODO public void registrar(Marca marca) throws
 * Exception
 * 
 * La anotación @Override indica que este método sobrescribe el
 * comportamiento de otro método con el mismo nombre y parámetros que
 * está definido en una clase padre o una interfaz1.
 * 
 * El método se llama registrar y recibe como parámetro un objeto de
 * tipo Marca, que representa una marca con un id y un nombre. El
 * método puede lanzar una excepción de tipo Exception si ocurre
 * algún error.
 * 
 * 
 * La variable sql contiene una consulta SQL que sirve para insertar
 * un registro en la tabla marca con los valores del id y el nombre
 * de la marca. Los signos de interrogación son parámetros que se
 * reemplazan por los valores reales más adelante2.
 * 
 * La variable sql2 está vacía y no se usa para nada. Se podría
 * eliminar sin afectar el funcionamiento del código.
 * 
 * El bloque try intenta ejecutar las instrucciones que están dentro
 * de los paréntesis. Estas instrucciones son:
 * Obtener una conexión a la base de datos usando el atributo
 * dataSource, que es una fuente de datos configurada previamente.
 * 
 * Crear un objeto de tipo PreparedStatement, que es una sentencia
 * SQL preparada para ejecutar con los parámetros que se le pasen3.
 * 
 * Establecer el valor del primer parámetro con el id de la marca,
 * usando el método setInt.
 * 
 * Establecer el valor del segundo parámetro con el nombre de la
 * marca, usando el método setString.
 * 
 * Ejecutar la sentencia SQL usando el método executeUpdate, que
 * devuelve el número de registros afectados por la operación.
 * 
 * El bloque catch captura cualquier excepción que ocurra dentro del
 * bloque try y la relanza usando el comando throw. Esto significa
 * que el método no maneja la excepción, sino que la delega al que lo
 * invoca.
 * 
 * El código usa la sintaxis de try-with-resources, que permite
 * cerrar automáticamente los recursos que se usan dentro del bloque
 * try, como la conexión y el PreparedStatement
 */













