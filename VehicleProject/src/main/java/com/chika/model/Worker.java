package com.chika.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.data.annotation.Transient;


@Entity
@Table(name = "workerhub")
public class Worker {
  
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private Integer work_id;
	    
		@Column(name = "email", nullable = false, unique = true)
		@Email
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

		public Integer getWork_id() {
			return work_id;
		}

		public void setWork_id(Integer work_id) {
			this.work_id = work_id;
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
}
