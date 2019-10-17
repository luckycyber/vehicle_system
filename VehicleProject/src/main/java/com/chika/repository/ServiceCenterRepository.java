package com.chika.repository;

import com.chika.model.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCenterRepository extends JpaRepository<ServiceCenter, Long> {
   
}
