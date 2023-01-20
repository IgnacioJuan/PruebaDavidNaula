package com.banco.springboot.app.service;

import java.util.List;

import com.banco.springboot.app.entity.Asignatura;


public interface AsignaturaServicio {
	
	 //Listar
	public List<Asignatura>findAll();
	//Guardar
	public Asignatura save(Asignatura asignatura);
	//Borrar
	public void DeleteByid(Long Id);
	//Encontrar
	public Asignatura FindById(Long Id);
	

}
