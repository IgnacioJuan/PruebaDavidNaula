package com.banco.springboot.app.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Asignatura {
	
	private static final long serialVersionUID = 1241450657617133037L;
	 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long iddocente;
private String nombre;
private String carrera;
private String horain;
private String horfain;

@ManyToOne
// Columna que se hace referencia
// referencedColumnName PONER TAL CUAL ESTA EL ID
@JoinColumn(name = "iddoc", referencedColumnName = "iddocente")


private Dondentee docente ;


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
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public String getHorain() {
	return horain;
}
public void setHorain(String horain) {
	this.horain = horain;
}
public String getHorfain() {
	return horfain;
}
public void setHorfain(String horfain) {
	this.horfain = horfain;
}








}
