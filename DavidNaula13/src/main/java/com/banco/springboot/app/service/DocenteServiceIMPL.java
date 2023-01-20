package com.banco.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.springboot.app.entity.Dondentee;
import com.banco.springboot.app.repository.AsignaturaRepository;
import com.banco.springboot.app.repository.DondenteRepository;
import com.ista.springboot.web.app.entity.Cliente;


@Service
public class DocenteServiceIMPL  implements DocenteServicio{
	
	@Autowired
	private DondenteRepository docente;

	@Override
	public List<Dondentee> findAll() {
		// TODO Auto-generated method stub
		return (List<Dondentee>) docente.findAll();
		
	}

	@Override
	public Dondentee save(Dondentee Dondentee) {
		// TODO Auto-generated method stub
		return docente.save(Dondentee);
	}

	@Override
	public void DeleteByid(Long Id) {
		// TODO Auto-generated method stub
		docente.deleteById(Id);
		
	}

	@Override
	public Dondentee FindById(Long Id) {
		// TODO Auto-generated method stub
		return docente.findById(Id).orElse(null);
	}

}
