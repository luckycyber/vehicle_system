package com.chika.model;

 

import java.util.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;



import org.springframework.data.annotation.Transient;




@Entity
@Table(name = "custhub")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private Long cust_id;
    
	@Column(name = "email")
	@Email
	@Valid
	private String email;
	
	@Column(name = "password")
	@Transient
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "contact")
    private int contact;
    
   
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="customer")
	private Set<MaintenanceRequest> maintenanceRequest = new HashSet<>();
	
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Vehicle> vehicle = new HashSet<>();
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "customer")
    private ServiceCenter serviceCenter;
    

    public Customer() {
    	
    }
    
    
    public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


	public Set<Vehicle> getVehicle() {
		return vehicle;
	}


	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}


	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}
    
	public Set<MaintenanceRequest> getMaintenanceRequest() {
		return maintenanceRequest;
	}

	public void setMaintenanceRequest(Set<MaintenanceRequest> maintenanceRequest) {
		this.maintenanceRequest = maintenanceRequest;
	}
    
}
