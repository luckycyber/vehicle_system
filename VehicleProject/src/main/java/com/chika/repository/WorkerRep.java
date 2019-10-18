package com.chika.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.Worker;



@Repository
public interface WorkerRep extends CrudRepository<Worker, Integer>{
	
}