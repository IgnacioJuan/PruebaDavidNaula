package com.banco.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.springboot.app.entity.Asignatura;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura, Long>{}
