
package com.chika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import com.chika.model.Worker;


import com.chika.service.WorkerServ;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class WorkerController {
    
    @Autowired
    private WorkerServ woServ;
    

    @GetMapping("/{wor}")
    public ResponseEntity <Worker>getWorkerById(@PathVariable("wor") Integer Work_id) {
    	Worker sus = woServ.getWorkerById(Work_id);
        
        return new ResponseEntity<Worker>(sus,HttpStatus.OK);
    }
    
    @GetMapping("/wor")
    public ResponseEntity <List<Worker>>getAllWorker() {
        List<Worker> sus = woServ.getAllWorker();            
        return new ResponseEntity<>(sus,HttpStatus.OK);
    }
    @PostMapping("/wor")
       public ResponseEntity<Void> Worker(@RequestBody Worker sus, UriComponentsBuilder builder){
    	Worker flag = woServ.addWorker(sus);
        if(flag==null)
           return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        HttpHeaders header = new HttpHeaders();
        header.setLocation(builder.path("/wor")
                .buildAndExpand(sus.getWork_id()).toUri());
        return new ResponseEntity<Void>(header, HttpStatus.CREATED);
    }
   
    @PutMapping("/wor")
    public ResponseEntity<Worker> updateWorker(@RequestBody Worker sus){
    woServ.updateWorker(sus);
     return new ResponseEntity<Worker>(sus, HttpStatus.OK);
     
 }
    @DeleteMapping("/wor")
    public ResponseEntity<Worker> deleteWorker(@RequestBody Worker sus){
    woServ.deleteWorker(sus);
     return new ResponseEntity<Worker>(sus, HttpStatus.OK);
     
 }
}

