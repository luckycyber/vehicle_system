package com.chika.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.model.Customer;
import com.chika.model.Vehicle;
	import com.chika.repository.VehicleRep;

	@Service
	public class VehServ {
		
		@Autowired
		private VehicleRep vehicleRepo;
		
		public Vehicle getVehicleById(Long vehicleId) {
			
    		Vehicle vito= vehicleRepo.findById(vehicleId).get();
    		return vito;
    	}
    	public List<Vehicle> getAllVehicles(){
    		List<Vehicle> list = new ArrayList<>();
    		vehicleRepo.findAll().forEach(e->list.add(e));
    		return list;
    	}

    public Vehicle addVehicle(Vehicle vu){
        return vehicleRepo.save(vu);
    }

    public void clearVehicles(List<Vehicle> vehicles){
      vehicleRepo.deleteAll();
    }

	

	public void deleteVehicle(Vehicle vehicle) {
		vehicleRepo.delete(vehicle);
		
	}

	public Vehicle updateVehicle(Vehicle vu) {
		return vehicleRepo.save(vu);
		
	}
}