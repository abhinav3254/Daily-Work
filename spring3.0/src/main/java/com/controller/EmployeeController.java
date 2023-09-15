package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(produces = "application/json")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list =  employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id ) {
		Employee em = employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(em,HttpStatus.OK);
	} 
	
	@PostMapping(consumes = "application/json")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public HttpStatus addEmployee(@RequestBody Employee employee) {
		if (employeeService.insertOrModifyEmployee(employee))
			return HttpStatus.OK;
		else return HttpStatus.NOT_MODIFIED;
	}
	
	@PutMapping(consumes = "application/json")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public HttpStatus modifyEmployee(@RequestBody Employee employee) {
		if (employeeService.insertOrModifyEmployee(employee))
			return HttpStatus.OK;
		else return HttpStatus.NOT_MODIFIED;
	}
	
	@DeleteMapping(value = "/id",produces = "application/json")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public HttpStatus deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployeeById(id);
		return HttpStatus.OK;
	}
	
	
}
