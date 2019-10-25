package com.chika.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.DAO.WorkerRep;
import com.chika.model.Worker;

@Service
public class WorkerServ {



    @Autowired
    private WorkerRep worRep;
    
    
    public Worker getWorkerById(Integer Work_id)
    {
    	Worker sus= worRep.findById(Work_id).get();
 
        return sus;    
    }
    
    public List<Worker> getAllWorker(){
        List<Worker> list = new ArrayList<>();
         worRep.findAll().forEach(wor->list.add(wor));
        return list;
        
    }
    public List<Worker> addAllWorker(List<Worker> sus){
        List<Worker> list = new ArrayList<>();
        worRep.saveAll(list);
        return list;
        
        
    }
    public Worker addWorker(Worker sus){
        worRep.save(sus);
        return sus;
        
    }
    public void updateWorker(Worker sus) {
        worRep.save(sus);
    }
    public void deleteWorker(Worker sus) {
        worRep.delete(sus);
    }
    
    
}