package com.chika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.chika.model.Customer;


@Repository
public interface CustRep extends JpaRepository<Customer, Long>{

}

