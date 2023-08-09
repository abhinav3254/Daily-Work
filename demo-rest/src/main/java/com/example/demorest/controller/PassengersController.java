package com.example.demorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.entity.Passengers;
import com.example.demorest.service.PassengersService;

//@RequestMapping("/pass")
@RestController
public class PassengersController {
	
	@Autowired
	PassengersService passengersService;
	
	@GetMapping(value = "/api/v1/pass/getAllPass",produces="application/json")
	public List<Passengers> getAll() {
		return passengersService.getAllPassengers();
	}
	
	@GetMapping(value="/api/v1/pass/getAllPass/{id}",produces="application/json")
	public Passengers getById(@PathVariable String id) {
		return passengersService.getPassengersById(id);
	}
	
	@PostMapping(value = "/api/v1/pass/insertPass",consumes = "application/json")
	public HttpStatus insertPassengers(@RequestBody Passengers passengers) {
		if (passengersService.insertOrModify(passengers)) return HttpStatus.OK;
		else return HttpStatus.NOT_MODIFIED;
	} 
	
	@PutMapping(value = "/api/v1/pass/updatePass",consumes = "application/json")
	public HttpStatus updatePassengers(@RequestBody Passengers passengers) {
		if (passengersService.insertOrModify(passengers)) return HttpStatus.OK;
		else return HttpStatus.NOT_MODIFIED;
	}
	
	@DeleteMapping(value = "/api/v1/pass/deletePass/{id}")
	public HttpStatus deletePassenger(@PathVariable String id) {
		if (passengersService.deletePassengers(Integer.parseInt(id))) return HttpStatus.OK;
		else return HttpStatus.NOT_FOUND;
	}
	
}
