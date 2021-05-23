package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeerepository;

    public List<Employee> listAll() {
        
		return employeerepository.findAll();
	}
	
    public void save(Employee employee) {
    	employeerepository.save(employee);
    }
    
    public Employee get(long id) {
        return employeerepository.findById(id).get();
    }
    
    public void delete(long id) {
    	employeerepository.deleteById(id);
    }

}
