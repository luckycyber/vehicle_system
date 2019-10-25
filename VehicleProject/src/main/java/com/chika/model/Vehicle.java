package com.chika.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "vehiclehub")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long vehicle_id;

    @Column(name="vehicle_number")
    private String vehicleNumber;
    
    @Column(name="vehicle_model")
    private String vehicleModel;


    @Column(name="vehicle_brand")
    private String vehicleBrand;
    
    @Column(name="warranty_Start_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date warrantyStartDate;

    @Column(name="warranty_End_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date warrantyEndDate;

    

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehicle_id", nullable = false)
   
    @JsonIgnore
    private Customer customer;


	public Long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}



	public String getVehicleNumber() {
		return vehicleNumber;
	}



	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public Date getWarrantyStartDate() {
		return warrantyStartDate;
	}

	public void setWarrantyStartDate(Date warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}

	public Date getWarrantyEndDate() {
		return warrantyEndDate;
	}


	public void setWarrantyEndDate(Date warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
}


	
		
		
	
	
	
	