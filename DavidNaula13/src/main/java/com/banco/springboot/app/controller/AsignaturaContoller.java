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
import com.banco.springboot.app.service.AsignaturaServicio;





@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class AsignaturaContoller {
	
	@Autowired
	private AsignaturaServicio asignaturacontroller;
	
	

	//Metodo para buscar =GetMapping
		@GetMapping("/Asignatura/{id}")
		public Asignatura Show(@PathVariable Long id) {
			return asignaturacontroller.FindById(id);
		}
		
		//Metodo para Guardar = PostMapping
		@PostMapping("/Asignatura")
		@ResponseStatus(HttpStatus.CREATED) // respuestas informativas = codigos de error o informacion html 
		public Asignatura create(@RequestBody Asignatura asignatura) { // Para procesar solicitudes de publicación
			return asignaturacontroller.save(asignatura);
		}
		
		
		//ACTUALIZAR

			@PutMapping ("/Asignatura/{id}")
			@ResponseStatus(HttpStatus.CREATED) // respuestas informativas = codigos de error o informacion html
			public Asignatura update(@RequestBody Asignatura asignatura , @PathVariable Long id) { 
				Asignatura asignaturaactual  = asignaturacontroller.FindById(id);  // primero Se ubica al cliente que se quiere actualizar  mediante el id
				
				asignaturaactual.setNombre(asignatura.getNombre());
				asignaturaactual.setCarrera(asignatura.getCarrera());
				asignaturaactual.setHorain(asignatura.getHorain());
				asignaturaactual.setHorfain(asignatura.getHorfain());
		
				
				return asignaturacontroller.save(asignaturaactual);
			}
			
			
			// BORRAR	
			@DeleteMapping("/Asignatura/{id}")
			@ResponseStatus(HttpStatus.NO_CONTENT)
			public void delete(@PathVariable Long id) {
				asignaturacontroller.DeleteByid(id); // se elimina mediante el id identificado 
			}
			
			//VER TODOS LOS DATOS
			@GetMapping("/Asignatura")
			public List <Asignatura> indext() {
				return  asignaturacontroller.findAll();
			}


		

}
