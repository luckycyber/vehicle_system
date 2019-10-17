package com.chika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chika.model.AdminModel;
import com.chika.service.AdminServ;

@RestController
public class AdminController {
	
	@Autowired
	private AdminServ adminServ;
	
	@GetMapping("Admin/{admin_id}")
	public ResponseEntity<AdminModel> getAdminById(@PathVariable("admin_id") Integer admin_id){
		AdminModel adminst = adminServ.getAdminById(admin_id);
		return new ResponseEntity<AdminModel>(adminst, HttpStatus.OK);
	}

}
