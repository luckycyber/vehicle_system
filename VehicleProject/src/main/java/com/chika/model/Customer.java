package com.chika.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;



@Entity
@Table(name="custhub")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
	private Integer cust_Id;
	
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
	 

	public Integer getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(Integer cust_Id) {
		this.cust_Id = cust_Id;
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
