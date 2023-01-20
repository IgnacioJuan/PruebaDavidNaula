package com.banco.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.banco.springboot.app.entity.Asignatura;
import com.banco.springboot.app.entity.Dondentee;
import com.banco.springboot.app.service.AsignaturaServicio;
import com.banco.springboot.app.service.DocenteServicio;



@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DocenteController {
	
	@Autowired
	private DocenteServicio docentecontroller;
	
	

	//Metodo para buscar =GetMapping
		@GetMapping("/Docente/{id}")
		public Dondentee Show(@PathVariable Long id) {
			return docentecontroller.FindById(id);
		}
		
		//Metodo para Guardar = PostMapping
		@PostMapping("/Docente")
		@ResponseStatus(HttpStatus.CREATED) // respuestas informativas = codigos de error o informacion html 
		public Dondentee create(@RequestBody Dondentee dondentee) { // Para procesar solicitudes de publicación
			return docentecontroller.save(dondentee);
		}
		
		
		//ACTUALIZAR

			@PutMapping ("/Docente/{id}")
			@ResponseStatus(HttpStatus.CREATED) // respuestas informativas = codigos de error o informacion html
			public Dondentee update(@RequestBody Dondentee dondentee , @PathVariable Long id) { 
				Dondentee docenteaactual  = docentecontroller.FindById(id);  // primero Se ubica al cliente que se quiere actualizar  mediante el id
				
				docenteaactual.setNombre(dondentee.getNombre());
				docenteaactual.setApellido(dondentee.getApellido());
				docenteaactual.setCelular(dondentee.getCelular());
				docenteaactual.setEmail(dondentee.getEmail());
		
				
				return docentecontroller.save(docenteaactual);
			}
			
			
			// BORRAR	
			@DeleteMapping("/Docente/{id}")
			@ResponseStatus(HttpStatus.NO_CONTENT)
			public void delete(@PathVariable Long id) {
				docentecontroller.DeleteByid(id); // se elimina mediante el id identificado 
			}
			
			//VER TODOS LOS DATOS
			@GetMapping("/Docente")
			public List <Dondentee> indext() {
				return  docentecontroller.findAll();
			}


		

}
