package com.chika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.model.AdminModel;
import com.chika.repository.AdminRep;

@Service
public class AdminServ {
	
	@Autowired
	private AdminRep adminRep;
	
	public AdminModel getAdminById(Integer admin_id) {
		AdminModel adminst = adminRep.findById(admin_id).get();
		return adminst;
	}
	
	public void updateAdmin(AdminModel adminst) {
		adminRep.save(adminst);
	}

}
