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


import com.chika.model.Vehicle;
import com.chika.service.VehicleServ;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class VehicleController {
    

    @Autowired
    private VehicleServ vehServ;
   
    	    
    	       
    	        @GetMapping("/{vehicle_id}")
    	        public ResponseEntity <Vehicle>getVehicleById(@PathVariable("vehicle_id") Long Vehicle_id) {
    	        	Vehicle sus = vehServ.getVehicleById(Vehicle_id);
    	            
    	            return new ResponseEntity<Vehicle>(sus,HttpStatus.OK);
    	        }
    	        
    	        @GetMapping("/vehicles")
    	        public ResponseEntity <List<Vehicle>>getAllVehicle() {
    	            List<Vehicle> sus = vehServ.getAllVehicle();            
    	            return new ResponseEntity<>(sus,HttpStatus.OK);
    	        }
    	        @PostMapping("/vu")
    	           public ResponseEntity<Void>Vehicle(@RequestBody Vehicle sus, UriComponentsBuilder builder){
    	        	Vehicle flag = vehServ.addVehicle(sus);
    	            if(flag==null)
    	               return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    	            HttpHeaders header = new HttpHeaders();
    	            header.setLocation(builder.path("/vu")
    	                    .buildAndExpand(sus.getVehicle_id()).toUri());
    	            return new ResponseEntity<Void>(header, HttpStatus.CREATED);
    	        }
    	       
    	        @PutMapping("/veh")
    	        public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle sus){
    	        vehServ.updateVehicle(sus);
    	         return new ResponseEntity<Vehicle>(sus, HttpStatus.OK);
    	         
    	     }
    	        @DeleteMapping("/vim")
    	        public ResponseEntity<Vehicle> deleteVehicle(@RequestBody Vehicle sus){
    	       vehServ.deleteVehicle(sus);
    	         return new ResponseEntity<Vehicle>(sus, HttpStatus.OK);
    	         
    	     }
    	    }