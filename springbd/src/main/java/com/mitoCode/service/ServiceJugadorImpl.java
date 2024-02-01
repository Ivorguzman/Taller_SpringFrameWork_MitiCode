package com.mitoCode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitoCode.beans.Jugador;
import com.mitoCode.dao.DAOJugador;


@Service
public class ServiceJugadorImpl implements ServiceJugador {

	/*
	 * La anotación @Autowired le dice Spring que inyecte una instancia
	 * de una clase que implemente la interfaz DAOJugador
	 * en el atributo daoJugador de la clase.
	 * [private DAOJugador daoJugador = new DAOJugadorImpl();]
	 */

	@Autowired
	private DAOJugador daoJugador;


	@Override public void registrar(Jugador jugador) throws Exception {

		try{
			this.daoJugador.registrar(jugador);

		} catch(Exception ex){
			throw ex;
		}



	}
}
