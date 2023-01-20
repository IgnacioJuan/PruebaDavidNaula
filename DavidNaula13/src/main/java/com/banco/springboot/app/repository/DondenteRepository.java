package com.banco.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.springboot.app.entity.Dondentee;

@Repository
public interface DondenteRepository extends CrudRepository<Dondentee, Long>{

}
