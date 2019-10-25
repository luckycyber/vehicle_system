package com.chika.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.Customer;

@Repository
public interface CustomerRepo extends CrudRepository <Customer, Long>{

}
