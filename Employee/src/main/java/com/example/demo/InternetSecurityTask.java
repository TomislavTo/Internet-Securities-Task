package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class InternetSecurityTask {

 
    private EmployeeService employeeservice; 
   
    @RequestMapping(value="/listEmployees", method=RequestMethod.GET)

    public String listEmployees(Model model) {
    	
   
    	List<Employee> employeeList = employeeservice.listAll();

        model.addAttribute("employees", employeeList);

        return "showListEmployees";
    }


    @RequestMapping(value="/addEmployee", method=RequestMethod.GET)
    
    public String addEmployee() {
    	
        return "showAddEmployeeForm";
    }


    @RequestMapping(value="/addEmployeeSubmit", method=RequestMethod.POST)

    public String addEmployeeSubmit(Employee employee) {

        employeeservice.save(employee);

        return "redirect:/employee/listEmployees";
    }
}

