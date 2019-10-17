package com.chika.model;

import javax.persistence.*;

import javax.validation.constraints.Email;



@Entity
@Table(name = "servicehub")
public class ServiceCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicehub_id")
    private Long servicehubId;

    @Column(name = "servicehub_name")
    private String servicehubName;

    @Column(name = "servicehub_address")
    private String address;

    @Column(name = "servicehub_contact")
    private String contact;
    
    @Email
    @Column(name = "servicehub_email")
    private String email;
    
    @Column(name = "servicehub_password")
    private String password;

    public ServiceCenter() {

    }
    
    

	public ServiceCenter(Long servicehubId, String servicehubName, String address, String contact, @Email String email,
			String password) {
		super();
		this.servicehubId = servicehubId;
		this.servicehubName = servicehubName;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

	
	public Long getServicehubId() {
		return servicehubId;
	}

	public void setServicehubId(Long servicehubId) {
		this.servicehubId = servicehubId;
	}

	public String getServicehubName() {
		return servicehubName;
	}

	public void setServicehubName(String servicehubName) {
		this.servicehubName = servicehubName;
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
	@Override
	public String toString() {
		return super.toString();
	}
	
	


   
	
}
