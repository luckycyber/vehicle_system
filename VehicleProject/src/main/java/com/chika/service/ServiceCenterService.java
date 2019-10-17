package com.chika.service;

import com.chika.model.ServiceCenter;
import com.chika.repository.ServiceCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCenterService {

    @Autowired
    private ServiceCenterRepository serviceCenterRepository;

    //retrieves all service center in the repository
    public List<ServiceCenter> getAllCenters(){
        return serviceCenterRepository.findAll();
    }

    public Optional<ServiceCenter> getCenterById(Long id){
        return serviceCenterRepository.findById(id);
    }

    public ServiceCenter addSCenter(ServiceCenter serviceCenter){
        return serviceCenterRepository.save(serviceCenter);
    }

    public void deleteSCenter(ServiceCenter serviceCenter){
        serviceCenterRepository.delete(serviceCenter);
    }

    public void clearSCenters(List<ServiceCenter> serviceCenters){
        serviceCenterRepository.deleteAll(serviceCenters);
    }

}
