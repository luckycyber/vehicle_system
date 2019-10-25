package com.chika.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.DAO.ServiceCenterRepo;
import com.chika.model.ServiceCenter;

@Service
public class ServiceCenterServ {


    @Autowired
    private ServiceCenterRepo serRepo;
    
    
    public ServiceCenter getServiceCenterById(Long ServiceCenter_id)
    {
    	ServiceCenter sus= serRepo.findById(ServiceCenter_id).get();
 
        return sus;    
    }
    
    public List<ServiceCenter> getAllServiceCenter(){
        List<ServiceCenter> list = new ArrayList<>();
         serRepo.findAll().forEach(cust->list.add(cust));
         //custRepo.findAll();
        return list;
        
    }
    public List<ServiceCenter> addAllCustomer(List<ServiceCenter> sus){
        List<ServiceCenter> list = new ArrayList<>();
        serRepo.saveAll(list);
        return list;
        
        
    }
    public ServiceCenter addServiceCenter(ServiceCenter sus){
        serRepo.save(sus);
        return sus;
        
    }
    public void updateServiceCenter(ServiceCenter sus) {
        serRepo.save(sus);
    }
    public void deleteServiceCenter(ServiceCenter sus) {
        serRepo.delete(sus);
    }
    
    
}