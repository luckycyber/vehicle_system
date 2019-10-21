package com.chika.model;



import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;



@Entity
@Table(name = "vehiclehub")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="vehicle_number")
    private String vehicleNumber;
    
    @Column(name="vehicle_model")
    private String vehicleModel;


    @Column(name="vehicle_brand")
    private String vehicleBrand;
    
    @Column(name="warranty_Start_Date")
    private String warrantyStartDate;

    @Column(name="warranty_End_Date")
    private String warrantyEndDate;

    

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
   
    @JsonIgnore
    private Customer customer;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getWarrantyStartDate() {
		return warrantyStartDate;
	}



	public void setWarrantyStartDate(String warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}



	public String getWarrantyEndDate() {
		return warrantyEndDate;
	}



	public void setWarrantyEndDate(String warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
}


	
		
		
	
	
	
	