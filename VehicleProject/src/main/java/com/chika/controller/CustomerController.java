package com.chika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chika.model.Customer;
import com.chika.repository.CustRep;

@RestController
public class CustomerController {

    @Autowired
    CustRep custRep;

    @PostMapping("/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(custRep.save(customer), HttpStatus.OK);
    }


}

