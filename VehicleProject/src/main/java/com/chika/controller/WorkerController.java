package com.chika.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import com.chika.model.Worker;

import com.chika.service.WorkerServ;

@RestController
public class WorkerController {


	@Autowired
	private WorkerServ workServ;

	@GetMapping("/wor/{work_Id}")
	public ResponseEntity <Worker>getWorkerById(@PathVariable("work_Id") Integer work_Id) {
		Worker wok = workServ.getWorkerById(work_Id);
		return new ResponseEntity<Worker>(wok,HttpStatus.OK);
	}
	
	@GetMapping("/wors")
   public ResponseEntity<List<Worker>> getAllCustomers(){
	   List<Worker> list = workServ.getAllWorkers();
	   return new ResponseEntity<List<Worker>>(list,HttpStatus.OK);
   }
	
	@PostMapping("/wor")
	   public ResponseEntity<Void> addWorker(@RequestBody Worker wuk, UriComponentsBuilder builder){
		Worker flag = workServ.addWorker(wuk);
		if(flag==null)
		   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(builder.path("/wor/{work_Id}")
				.buildAndExpand(wuk.getWork_Id()).toUri());
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	
	@PutMapping("/wor")
    public ResponseEntity<Worker>	updateWorker(@RequestBody Worker wo){
    workServ.updateWorker(wo);
	return new ResponseEntity<Worker>(wo, HttpStatus.OK);
	
}
    @DeleteMapping("/wor")
    public ResponseEntity<Void>	deleteWorker(@PathVariable("work_Id") Worker work_Id){
   workServ.deleteWorker(work_Id);
    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}
}

