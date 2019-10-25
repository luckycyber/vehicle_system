package com.chika.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chika.model.MaintenanceRequest;

@Repository
public interface MaintenaceRequestRep extends CrudRepository<MaintenanceRequest, Long> {

}
