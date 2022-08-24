package com.SpringDockerEmployee.SpringDockerJenks;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
@GetMapping("/employees")
public List<Employee> getAllEmployees() {
	return EmployeeService.getAllEmployees();
}
@GetMapping("/employee/{employeeId}")
public Employee getEmployeeDetails(@PathVariable Long employeeId) {
	return EmployeeService.getAllEmployeeDetails(employeeId);
}
@PostMapping("/addEmployee")
public Employee addEmployee(@RequestBody Employee employee ) {
	return EmployeeService.addEmployee(employee);
}
@PutMapping("/upadateEmployee")
public Employee upadateEmployee(@PathVariable Long employeeid, @RequestBody Employee employee) {
	return EmployeeService.updateEmployee(employeeid,employee);
}
	

}
