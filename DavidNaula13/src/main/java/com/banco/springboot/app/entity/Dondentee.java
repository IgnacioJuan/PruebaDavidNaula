package com.banco.springboot.app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Dondentee {
	private static final long serialVersionUID = 2428507921656207197L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long iddocente;
private String nombre;
private String apellido;
@Column(unique = true)
private String email;
private String celular;



@JsonIgnore
@OneToMany(mappedBy = "docente")
private List<Asignatura> asignatura;


public Long getIddocente() {
	return iddocente;
}
public void setIddocente(Long iddocente) {
	this.iddocente = iddocente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}



	

}
