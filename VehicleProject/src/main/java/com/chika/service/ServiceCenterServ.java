package com.chika.service;


import com.chika.model.ServiceCenter;

import com.chika.repository.ServiceCenterRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceCenterServ {

    @Autowired
    private ServiceCenterRep sCenterRepo;
        
    	public ServiceCenter getServiceCenterById(Long servId) {
    		ServiceCenter serv = sCenterRepo.findById(servId).get();
    		return serv;
    	}
        

    	public List<ServiceCenter> getAllServiceCenters(){
    		List<ServiceCenter> list = new ArrayList<>();
    		sCenterRepo.findAll().forEach(e->list.add(e));
    		return list;
    	}

    public ServiceCenter addServiceCenter(ServiceCenter serviceCenter){
        return sCenterRepo.save(serviceCenter);
    }

    public void deleteSCenter(ServiceCenter serviceCenter){
        sCenterRepo.delete(serviceCenter);
    }

    public void clearSCenters(List<ServiceCenter> serviceCenters){
        sCenterRepo.deleteAll(serviceCenters);
    }
    
    public void updateSCenter(ServiceCenter serviceCenter){
        sCenterRepo.save(serviceCenter);
    }

}

