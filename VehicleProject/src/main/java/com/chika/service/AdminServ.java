package com.chika.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.model.Admin;
import com.chika.repository.AdminRep;

@Service
public class AdminServ {
	
	@Autowired
	private AdminRep adminRep;
	
	public Admin getAdminById(Integer admin_id) {
		Admin adminst = adminRep.findById(admin_id).get();
		return adminst;
	}
	
	public void updateAdmin(Admin adminst) {
		adminRep.save(adminst);
	}

	public Admin addAdminModel(Admin admmo) {
		 return adminRep.save(admmo);
		
	}

	public List<Admin> getAllAdminModels() {
		List<Admin> list = new ArrayList<>();
		adminRep.findAll().forEach(e->list.add(e));
		return list;
	}

	public void deleteAdmin(Integer admin_Id) {
		adminRep.deleteById(admin_Id);;
		
	}

}
