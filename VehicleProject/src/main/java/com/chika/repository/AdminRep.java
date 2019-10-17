package com.chika.repository;

import org.springframework.data.repository.CrudRepository;

import com.chika.model.AdminModel;

public interface AdminRep extends CrudRepository<AdminModel, Integer> {

	

}
