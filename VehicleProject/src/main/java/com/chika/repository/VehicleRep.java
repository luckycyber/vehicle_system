package com.chika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.chika.model.Vehicle;



@Repository
public interface VehicleRep extends JpaRepository<Vehicle, Long>{

	
}
