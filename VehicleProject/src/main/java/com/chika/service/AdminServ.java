package com.chika.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.DAO.AdminRep;
import com.chika.model.Admin;

@Service
public class AdminServ {
	    @Autowired
	    private AdminRep adRep;
	    
	    
	    public Admin getAdminById(Integer Admin_id)
	    {
	    	Admin sus= adRep.findById(Admin_id).get();
	 
	        return sus;    
	    }
	    
	    public List<Admin> getAllAdmin(){
	        List<Admin> list = new ArrayList<>();
	         adRep.findAll().forEach(ad->list.add(ad));
	        return list;
	        
	    }
	    public List<Admin> addAllAdmin(List<Admin> sus){
	        List<Admin> list = new ArrayList<>();
	        adRep.saveAll(list);
	        return list;
	        
	        
	    }
	    public Admin addAdmin(Admin sus){
	        adRep.save(sus);
	        return sus;
	        
	    }
	    public void updateAdmin(Admin sus) {
	        adRep.save(sus);
	    }
	    public void deleteAdmin(Admin sus) {
	        adRep.delete(sus);
	    }
	    
	    
	}
