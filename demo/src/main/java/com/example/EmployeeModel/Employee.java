package com.example.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		// TODO Auto-generated constructor stub
	}
	
}
