package com.chika.model;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "servicehub")
public class ServiceCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long serviceCenter_id;

    @Column(name = "branch_name")
    private String branchName;
    
    @Email
    @Valid
    @Column(name = "email")
    private String email;
    
    @Column(name = "contact")
    private int contact;
    
    @Column(name = "address")
    private String address;

    
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "serviceCenter_id", nullable = false)
   
    @JsonIgnore
    private Customer customer;


	public Long getServiceCenter_id() {
		return serviceCenter_id;
	}

	public void setServiceCenter_id(Long serviceCenter_id) {
		this.serviceCenter_id = serviceCenter_id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    	
}
