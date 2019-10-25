package com.chika.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.chika.model.Customer;
import com.chika.service.CustServ;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class CustomerController {
	    
	        @Autowired
	        private CustServ custServ;
	        
	        @GetMapping("/{cus}")
	        public ResponseEntity <Customer>getCustomerById(@PathVariable("cus") Long cust_id) {
	            Customer cus = custServ.getCustomerById(cust_id);
	            
	            return new ResponseEntity<Customer>(cus,HttpStatus.OK);
	        }
	        
	        @GetMapping("/cus")
	        public ResponseEntity <List<Customer>>getAllCustomers() {
	            List<Customer> cust = custServ.getAllCustomer();            
	            return new ResponseEntity<>(cust,HttpStatus.OK);
	        }
	        @PostMapping("/cus")
	           public ResponseEntity<Void> Customer(@RequestBody Customer cus, UriComponentsBuilder builder){
	            Customer flag = custServ.addCustomer(cus);
	            if(flag==null)
	               return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	            HttpHeaders header = new HttpHeaders();
	            header.setLocation(builder.path("/cus")
	                    .buildAndExpand(cus.getCust_id()).toUri());
	            return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	        }
	        //********************************************************
	    /*
	     * @PostMapping("/insertall") public ResponseEntity<Void> Customer(@RequestBody
	     * List<Customers> list, UriComponentsBuilder builder){ List<Customers> flag =
	     * custService.addAllCustomer(list); if(flag==null) return new
	     * ResponseEntity<Void>(HttpStatus.CONFLICT); HttpHeaders header = new
	     * HttpHeaders(); header.setLocation(builder.path("/customer")
	     * .buildAndExpand(((Customers) list).getCuId()).toUri()); return new
	     * ResponseEntity<Void>(header, HttpStatus.CREATED); }
	     */
	        
	        @PutMapping("/cus")
	        public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cus){
	        custServ.updateCustomer(cus);
	         return new ResponseEntity<Customer>(cus, HttpStatus.OK);
	         
	     }
	        @DeleteMapping("/cus")
	        public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer cus){
	        custServ.deleteCustomer(cus);
	         return new ResponseEntity<Customer>(cus, HttpStatus.OK);
	         
	     }
	    }
