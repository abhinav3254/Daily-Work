package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeRepository;
import com.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Employee getEmployeeById(int empId) {
		Optional<Employee> optional = employeeRepository.findById(empId);
		if (optional.isEmpty()) return null;
		else return optional.get();
	}
	
	@Transactional
	public boolean insertOrModifyEmployee(Employee employee) {
		Employee e =  employeeRepository.save(employee);
		return e!=null;
	}
	
	@Transactional
	public void deleteEmployeeById(int empId) {
		employeeRepository.deleteById(empId);
	}
	
}
