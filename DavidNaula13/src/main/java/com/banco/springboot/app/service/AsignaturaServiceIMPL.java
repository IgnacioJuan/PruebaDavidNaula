package com.banco.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.springboot.app.entity.Asignatura;
import com.banco.springboot.app.repository.AsignaturaRepository;



@Service
public class AsignaturaServiceIMPL  implements AsignaturaServicio{
	
	@Autowired
	private AsignaturaRepository asignatura2;

	@Override
	public List<Asignatura> findAll() {
		// TODO Auto-generated method stub
		return (List<Asignatura>) asignatura2.findAll();
	}

	@Override
	public Asignatura save(Asignatura asignatura) {
		// TODO Auto-generated method stub
		return asignatura2.save(asignatura);
	}

	@Override
	public void DeleteByid(Long Id) {
		// TODO Auto-generated method stub
		asignatura2.deleteById(Id);
		
	}

	@Override
	public Asignatura FindById(Long Id) {
		// TODO Auto-generated method stub
		return asignatura2.findById(Id).orElse(null);
	}

}
