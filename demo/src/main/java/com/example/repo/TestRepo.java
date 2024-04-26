package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.EmployeeModel.Employee;

import java.util.Arrays;
import java.util.List;

@Repository
public class TestRepo {
	
	
	public String MethodRepo()
	{
		return "\t welcome inside repo method of TestRepo Class!!!!";
	}

//	public List<Employee> employeeList(){
//		Employee e1= new Employee(1,"ccc");
//		Employee e2= new Employee(4,"nnn");
//		Employee e3= new Employee(7,"ppp");
//		Employee e4= new Employee(1,"ccc");
//		Employee e5= new Employee(5,"yyy");
//		
//		List empList= Arrays.asList(e1,e2,e3,e4,e5);
//		return empList;
//	}
}
