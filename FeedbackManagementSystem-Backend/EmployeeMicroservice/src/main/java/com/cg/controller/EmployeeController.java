package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Employee;
import com.cg.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl service;
	
	/**
	 * {
    		"employeeName": "Shekhar",
   			"password": "admin",
    		"role": "Participant"
		}
	 * 	
	 */
	

	//http://localhost:8034/employee/addemployee
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee e) {
		Employee employee = service.addEmployee(e);
		return employee;
	}
	
	//http://localhost:8034/employee/employeebyid/{empId}
	@GetMapping("/employeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable(value = "empId")int empId) {
		return this.service.checkRole(empId);
		
	}
	

}
