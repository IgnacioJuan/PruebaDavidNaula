package com.banco.springboot.app.service;

import java.util.List;

import com.banco.springboot.app.entity.Asignatura;
import com.banco.springboot.app.entity.Dondentee;

public interface DocenteServicio {
	
	 //Listar
	public List<Dondentee>findAll();
	//Guardar
	public Dondentee save(Dondentee Dondentee);
	//Borrar
	public void DeleteByid(Long Id);
	//Encontrar
	public Dondentee FindById(Long Id);

}
