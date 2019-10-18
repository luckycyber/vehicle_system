package com.chika.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="workhub")
public class Worker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
	private Integer work_Id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "password")
	private String password;
	
	 @Column(name = "contact")
	private String contact;
	 
	 @Email
	 @Column(name = "email")
	private String email;

	public Integer getWork_Id() {
		return work_Id;
	}

	public void setWork_Id(Integer work_Id) {
		this.work_Id = work_Id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	 
	 
}