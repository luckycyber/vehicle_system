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

import com.chika.model.Admin;



import com.chika.service.AdminServ;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class AdminController {
 
        @Autowired
        private AdminServ adServ;
        

        @GetMapping("/admin_id}")
        public ResponseEntity <Admin>getAdminById(@PathVariable("admid_id") Integer Admin_id) {
        	Admin sus = adServ.getAdminById(Admin_id);
            
            return new ResponseEntity<Admin>(sus,HttpStatus.OK);
        }
        
        @GetMapping("/ads")
        public ResponseEntity <List<Admin>>getAllAdmin() {
            List<Admin> sus = adServ.getAllAdmin();            
            return new ResponseEntity<>(sus,HttpStatus.OK);
        }
        @PostMapping("/po")
           public ResponseEntity<Void> Admin(@RequestBody Admin sus, UriComponentsBuilder builder){
        	Admin flag = adServ.addAdmin(sus);
            if(flag==null)
               return new ResponseEntity<Void>(HttpStatus.CONFLICT);
            HttpHeaders header = new HttpHeaders();
            header.setLocation(builder.path("/po")
                    .buildAndExpand(sus.getAdmin_id()).toUri());
            return new ResponseEntity<Void>(header, HttpStatus.CREATED);
        }
       
        @PutMapping("/pi")
        public ResponseEntity<Admin> updateAdmin(@RequestBody Admin sus){
        adServ.updateAdmin(sus);
         return new ResponseEntity<Admin>(sus, HttpStatus.OK);
         
     }
        @DeleteMapping("/de")
        public ResponseEntity<Admin> deleteAdmin(@RequestBody Admin sus){
        adServ.deleteAdmin(sus);
         return new ResponseEntity<Admin>(sus, HttpStatus.OK);
         
     }
    }
