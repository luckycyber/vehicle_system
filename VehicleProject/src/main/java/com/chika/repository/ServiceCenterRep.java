package com.chika.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.ServiceCenter;

@Repository
public interface ServiceCenterRep extends CrudRepository<ServiceCenter, Long> {
   
}


