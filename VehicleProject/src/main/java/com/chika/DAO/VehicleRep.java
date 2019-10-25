package com.chika.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.Vehicle;

@Repository
public interface VehicleRep extends CrudRepository<Vehicle, Long>{

}
