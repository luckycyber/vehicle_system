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



import com.chika.model.ServiceCenter;
import com.chika.service.ServiceCenterServ;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class ServiceCenterController {
    
    @Autowired
    private ServiceCenterServ enterServ;
   
    	    
    	       
    	        @GetMapping("/{ServiceCenter_id}")
    	        public ResponseEntity <ServiceCenter>getCustomerById(@PathVariable("ServiceCenter_id") Long ServiceCenter_id) {
    	        	ServiceCenter sus = enterServ.getServiceCenterById(ServiceCenter_id);
    	            
    	            return new ResponseEntity<ServiceCenter>(sus,HttpStatus.OK);
    	        }
    	        
    	        @GetMapping("/sers")
    	        public ResponseEntity <List<ServiceCenter>>getAllServiceCenter() {
    	            List<ServiceCenter> sus = enterServ.getAllServiceCenter();            
    	            return new ResponseEntity<>(sus,HttpStatus.OK);
    	        }
    	        @PostMapping("/su")
    	           public ResponseEntity<Void> Customer(@RequestBody ServiceCenter sus, UriComponentsBuilder builder){
    	        	ServiceCenter flag = enterServ.addServiceCenter(sus);
    	            if(flag==null)
    	               return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    	            HttpHeaders header = new HttpHeaders();
    	            header.setLocation(builder.path("/su")
    	                    .buildAndExpand(sus.getServiceCenter_id()).toUri());
    	            return new ResponseEntity<Void>(header, HttpStatus.CREATED);
    	        }
    	       
    	        @PutMapping("/si")
    	        public ResponseEntity<ServiceCenter> updateCustomer(@RequestBody ServiceCenter sus){
    	        enterServ.updateServiceCenter(sus);
    	         return new ResponseEntity<ServiceCenter>(sus, HttpStatus.OK);
    	         
    	     }
    	        @DeleteMapping("/sa")
    	        public ResponseEntity<ServiceCenter> deleteServiceCenter(@RequestBody ServiceCenter sus){
    	        enterServ.deleteServiceCenter(sus);
    	         return new ResponseEntity<ServiceCenter>(sus, HttpStatus.OK);
    	         
    	     }
    	    }
