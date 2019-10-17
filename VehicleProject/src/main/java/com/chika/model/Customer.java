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
    @Column(name = "custhub_id")
	private int cust_Id;
	
	@Column(name = "custhub_Name")
	private String cust_Name;
	
	@Column(name = "custhub_address")
	private String cust_address;
	
	@Column(name = "custhub_password")
	private String cust_password;
	
	 @Column(name = "custhub_contact")
	private String cust_contact;
	 
	 @Email
	 @Column(name = "custhub_email")
	private String cust_email;
	
	
	public Customer(int cust_Id, String cust_Name, String cust_address, String cust_password, String cust_contact,
			String cust_email) {
		super();
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.cust_address = cust_address;
		this.cust_password = cust_password;
		this.cust_contact = cust_contact;
		this.cust_email = cust_email;
	}
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_password() {
		return cust_password;
	}
	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}
	public String getCust_contact() {
		return cust_contact;
	}
	public void setCust_contact(String cust_contact) {
		this.cust_contact = cust_contact;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
}
