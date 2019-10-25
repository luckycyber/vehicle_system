package com.chika.model;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="MaintenanceRequesthub")
public class MaintenanceRequest{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Long maintenanceRequest_id;

@Column(name="request")
private Request Request;

@Email
@Valid
@Column(name = "email")
private String email;

@Column(name = "first_name")
private String firstName;

@Column(name = "last_name")
private String lastName;

@Column(name = "contact")
private int contact;

@OneToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "maintenanceRequest_id", nullable = false)
@JsonIgnore
private Customer customer;

private MaintenanceRequest () {
	
}

public Long getMaintenanceRequest_id() {
	return maintenanceRequest_id;
}

public void setMaintenanceRequest_id(Long maintenanceRequest_id) {
	this.maintenanceRequest_id = maintenanceRequest_id;
}

public Request getRequest() {
	return Request;
}

public void setRequest(Request request) {
	Request = request;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getContact() {
	return contact;
}

public void setContact(int contact) {
	this.contact = contact;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}


}