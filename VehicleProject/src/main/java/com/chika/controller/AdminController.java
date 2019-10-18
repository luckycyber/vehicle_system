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

import com.chika.model.Admin;
import com.chika.service.AdminServ;


@RestController
public class AdminController {
	
	
		@Autowired
		private AdminServ adminServ;

		@GetMapping("/model/{admin_Id}")
		public ResponseEntity <Admin>getAdminModelById(@PathVariable("admin_Id") Integer admin_Id) {
			Admin ad = adminServ.getAdminById(admin_Id);
			return new ResponseEntity<Admin>(ad,HttpStatus.OK);
		}
		@GetMapping("/models")
	   public ResponseEntity<List<Admin>> getAllAdminModels(){
		   List<Admin> list = adminServ.getAllAdminModels();
		   return new ResponseEntity<List<Admin>>(list,HttpStatus.OK);
	   }
		@PostMapping("/model")
		   public ResponseEntity<Void> addAdmin(@RequestBody Admin admmo, UriComponentsBuilder builder){
			Admin flag = adminServ.addAdminModel(admmo);
			if(flag==null)
			   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			HttpHeaders header = new HttpHeaders();
			header.setLocation(builder.path("/adminModel/{admin_Id}")
					.buildAndExpand(admmo.getAdmin_Id()).toUri());
			return new ResponseEntity<Void>(header, HttpStatus.CREATED);
		}
		@PutMapping("/model")
	    public ResponseEntity<Admin>	updateAdminModel(@RequestBody Admin admmo){
	    adminServ.updateAdmin(admmo);
		return new ResponseEntity<Admin>(admmo, HttpStatus.OK);
		
	}
	    @DeleteMapping("/model")
	    public ResponseEntity<Void>	deleteAdmin(@PathVariable("admin_Id") Integer admin_Id){
	   adminServ.deleteAdmin(admin_Id);
	    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	}