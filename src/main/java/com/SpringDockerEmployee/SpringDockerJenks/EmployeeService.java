package com.SpringDockerEmployee.SpringDockerJenks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	private static Map<Long,Employee> employees =new HashMap<>();
	private static Long index =10L;
	
	static {
		Employee employee1 = new Employee(1L,"Prasad","999999999",10000L);
		Employee employee2 = new Employee(2L,"Chandu","996573847",20000L);
		Employee employee3 = new Employee(3L,"Vamshi","847356478",17000L);
		Employee employee4 = new Employee(4L,"Pranay","764526735",18000L);
		Employee employee5 = new Employee(5L,"Sushimta","999532498",23000L);
		Employee employee6 = new Employee(6L,"Naresh","9067543684",33000L);
		Employee employee7 = new Employee(7L,"Afrin","8875563635",35000L);
		Employee employee8 = new Employee(8L,"Krishna","7895634210",25000L);
		Employee employee9 = new Employee(9L,"Saritha","9667766545",15000L);
		Employee employee10 = new Employee(10L,"Sandhya","9987990123",19000L);
		employees.put(1L, employee1);
		employees.put(2L, employee2);
		employees.put(3L, employee3);
		employees.put(4L, employee4);
		employees.put(5L, employee5);
		employees.put(6L, employee6);
		employees.put(7L, employee7);
		employees.put(8L, employee8);
		employees.put(9L, employee9);
		employees.put(10L, employee10);
		
	}

	public static List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employees.values());
	}

	public static Employee addEmployee(Employee employee) {
		index +=1;
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}

	public static Employee updateEmployee(Long employeeid, Employee employee) {
		employee.setId(employeeid);
		employees.put(employeeid, employee);
		return employee;
	}

	public static Employee getAllEmployeeDetails(Long employeeId) {
	
		return employees.get(employeeId);
	}

}
