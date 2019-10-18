package com.chika.service;


import com.chika.model.Worker;

import com.chika.repository.WorkerRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WorkerServ {

    @Autowired
    private WorkerRep workRepo;
        
    	public Worker getWorkerById(Integer work_Id) {
    		Worker wo = workRepo.findById(work_Id).get();
    		return wo;
    	}
        

    	public List<Worker> getAllWorkers(){
    		List<Worker> list = new ArrayList<>();
    		workRepo.findAll().forEach(e->list.add(e));
    		return list;
    	}

    public Worker addWorker(Worker worker){
        return workRepo.save(worker);
    }

    public void deleteWorker(Worker worker){
        workRepo.delete(worker);
    }

    public void clearWorkers(List<Worker> workers){
        workRepo.deleteAll(workers);
    }


	public void updateWorker(Worker wo) {
		 workRepo.save(wo);
		
	}

}


