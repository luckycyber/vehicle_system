package com.chika.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.Admin;

@Repository
public interface AdminRep extends CrudRepository<Admin, Integer> {

}
