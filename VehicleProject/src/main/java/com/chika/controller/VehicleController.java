package com.chika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chika.model.Vehicle;
import com.chika.repository.VehicleRep;

@RestController
public class VehicleController {

    @Autowired
    VehicleRep vehicleRep;

    @PostMapping("vehicle")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
        return new ResponseEntity<>(vehicleRep.save(vehicle), HttpStatus.OK);
    }

    @GetMapping("vehicle/{id}")
    public ResponseEntity<Vehicle> getUser(@PathVariable Long id){
        return new ResponseEntity<Vehicle>(vehicleRep.findById(id).get(), HttpStatus.OK);
    }
}

