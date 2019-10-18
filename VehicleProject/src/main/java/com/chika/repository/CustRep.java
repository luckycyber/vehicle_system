package com.chika.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.Customer;


@Repository
public interface CustRep extends CrudRepository<Customer, Integer>{

}

