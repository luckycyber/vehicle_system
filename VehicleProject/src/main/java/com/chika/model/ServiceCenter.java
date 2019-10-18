package com.chika.model;

import javax.persistence.*;

import javax.validation.constraints.Email;



@Entity
@Table(name = "servicehub")
public class ServiceCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serv_id")
    private Long servicehubId;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;
    
    @Column(name = "address")
    private String address;

    @Column(name = "contact")
    private String contact;
    
    @Email
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "serv_type")
    private String serv_type;

	public Long getServicehubId() {
		return servicehubId;
	}

	public void setServicehubId(Long servicehubId) {
		this.servicehubId = servicehubId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServ_type() {
		return serv_type;
	}

	public void setServ_type(String serv_type) {
		this.serv_type = serv_type;
	}
    

   
    
    

	


   
	
}
