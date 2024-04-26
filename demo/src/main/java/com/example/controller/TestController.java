package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeModel.Employee;
import com.example.service.TestService;

@RestController
public class TestController{
	
	@Autowired
	TestService testService; 
	
	@GetMapping("/test")
	public String greet() {
		String str= testService.greetMethod();
		return str;
			//return "welcome to SpringBoot Application";
	}
	
//	@GetMapping("/empDetails")
//	public List<Employee> getEmpDetails()
//	{
//		return testService.empDetails();
//	}
}
