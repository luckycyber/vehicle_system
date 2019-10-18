package com.chika.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chika.model.Customer;

import com.chika.repository.CustRep;

@Service
public class CustServ {

	 @Autowired
	    private CustRep custRepo;
	        
	    	public Customer getCustomerById(Integer custId) {
	    		Customer custo= custRepo.findById(custId).get();
	    		return custo;
	    	}

	    	public List<Customer> getAllCustomers(){
	    		List<Customer> list = new ArrayList<>();
	    		custRepo.findAll().forEach(e->list.add(e));
	    		return list;
	    	}

	    public Customer addCustomer(Customer customer){
	        return custRepo.save(customer);
	    }

	    public void deleteCustomer(Customer customer){
	        custRepo.delete(customer);
	    }

	    public void clearCustomers(List<Customer> customers){
	      custRepo.deleteAll(customers);
	    }

		public void updateCustomer(Customer cu) {
			custRepo.save(cu);
			
			
		}

	}
