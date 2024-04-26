package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.EmployeeModel.Employee;
import com.example.repo.TestRepo;

@Service
public class TestService {
	
	@Autowired
	TestRepo testRepo;

	public String greetMethod()
	{
		return testRepo.MethodRepo();
	}
	
	public List<Employee> empDetails(){
	
		return testRepo.employeeList();
	}
}
