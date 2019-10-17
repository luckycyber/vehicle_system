package com.chika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.repository.AdminRep;

@Service
public class AdminServ {
	
	@Autowired
	private AdminRep adminRep;
	
	public AdminModel getAdminById(Integer admin_id) {
		AdminModel adminst = adminrep.findById(admin_id).get();
		return adminst;
	}
	
	public void updateAdmin(AdminModel adminst) {
		adminrep.save(adminst)adminst;
	}

}
