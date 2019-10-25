package com.chika.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.ServiceCenter;

@Repository
public interface ServiceCenterRepo extends CrudRepository<ServiceCenter, Long> {

}
