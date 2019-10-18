package com.chika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import com.chika.model.Customer;

import com.chika.service.CustServ;

@RestController
public class CustomerController {


	@Autowired
	private CustServ custServ;

	@GetMapping("/cos/{cust_Id}")
	public ResponseEntity <Customer>getCustomerById(@PathVariable("cust_Id") Integer cust_Id) {
		Customer co = custServ.getCustomerById(cust_Id);
		return new ResponseEntity<Customer>(co,HttpStatus.OK);
	}
	@GetMapping("/custs")
   public ResponseEntity<List<Customer>> getAllCustomers(){
	   List<Customer> list = custServ.getAllCustomers();
	   return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
   }
	@PostMapping("/cos")
	   public ResponseEntity<Void> addAdminModel(@RequestBody Customer cu, UriComponentsBuilder builder){
		Customer flag = custServ.addCustomer(cu);
		if(flag==null)
		   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(builder.path("/cust/{cust_Id}")
				.buildAndExpand(cu.getCust_Id()).toUri());
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	@PutMapping("/cos")
    public ResponseEntity<Customer>	updateCustomer(@RequestBody Customer cu){
    custServ.updateCustomer(cu);
	return new ResponseEntity<Customer>(cu, HttpStatus.OK);
	
}
    @DeleteMapping("/cos")
    public ResponseEntity<Void>	deleteCustomer(@PathVariable("cust_Id") Customer cust_Id){
   custServ.deleteCustomer(cust_Id);
    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}
}

