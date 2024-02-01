package com.mitoCode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitoCode.beans.Marca;
import com.mitoCode.dao.DAOMarca;


@Repository
public class ServiceMarcaImpl implements ServiceMarca {

	@Autowired
	private DAOMarca daoMarca;

	@Override public void registrar(Marca marca) throws Exception {
		try{
			this.daoMarca.registrar(marca);

		} catch(Exception ex){
			throw ex;
		}

	}

}
