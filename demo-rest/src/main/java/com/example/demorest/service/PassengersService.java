package com.example.demorest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demorest.entity.Passengers;
import com.example.demorest.exception.ResourceNotFoundException;
import com.example.demorest.repositry.PassengerRepositry;
@Service
public class PassengersService {
	@Autowired
	PassengerRepositry passengerRepositry;
	
	@Transactional(readOnly = true)
	public List<Passengers> getAllPassengers() {
		return passengerRepositry.findAll();
	}
	
	@Transactional(readOnly = true)
	public Passengers getPassengersById(String id) {
		Optional<Passengers> passengers = passengerRepositry.findById(Integer.parseInt(id));
		if (passengers.isPresent()) return passengers.get();
		else return null;
	}
	
	@Transactional
	public boolean insertOrModify(Passengers passengers) {
		if (passengerRepositry.save(passengers) != null) return true;
		else throw new ResourceNotFoundException();
	}
	
	@Transactional
	public boolean deletePassengers(int passengerId) {
		long count = passengerRepositry.count();
		passengerRepositry.deleteById(passengerId);
		if (count > passengerRepositry.count()) return true;
		else throw new ResourceNotFoundException();
	}
	
}
