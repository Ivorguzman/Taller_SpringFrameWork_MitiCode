package com.mitoCode.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitoCode.beans.Jugador;
import com.mitoCode.dao.DAOJugador;

@Repository
public class DAOJugadorImpl implements DAOJugador {

	public interface ServiceJugador {

	}




	@Autowired
	private DataSource dataSource;
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
	String sql = "INSERT INTO jugador(id,nombre,idEquipo,idCamiserta) VALUES (?,?,?,?)";




	@Override public void registrar(Jugador jugador) throws Exception {

		System.out.println(jugador.getId());
		System.out.println(jugador.getNombre());

		try (Connection conn = this.datosConeccion.getConnection(); PreparedStatement ps = conn.prepareStatement(this.sql)){
			ps.setInt(1, jugador.getId());
			ps.setString(2, jugador.getNombre());
			ps.setInt(3, jugador.getEquipo().getId());
			ps.setInt(4, jugador.getCamiseta().getId());
			ps.executeUpdate();
		} catch(Exception ex){
			throw ex;
		}
	}

}



