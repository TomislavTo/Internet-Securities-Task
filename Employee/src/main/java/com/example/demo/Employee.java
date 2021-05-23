package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	
	@Entity(name="EMPLOYEES")
	public class Employee {
		
	  
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;

	    private String userName;

	    private String title;

	    private long salary;
	    
	    private String location;

	    private String email;


	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public long getSalary() {
	        return salary;
	    }

	    public void setSalary(long salary) {
	        this.salary = salary;
	    }
	    
	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	}

