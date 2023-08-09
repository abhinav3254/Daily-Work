package com.example.demorest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demorest.entity.Train;
import com.example.demorest.exception.ResourceNotFoundException;
import com.example.demorest.exception.ResourceNotModifiedException;
import com.example.demorest.repositry.TrainRepositry;

@Service
public class TrainService {
	@Autowired
	TrainRepositry trainRepositry;
	
	@Transactional(readOnly = true)
	public List<Train> getAllTrains() {
		return trainRepositry.findAll();
	}
	
	@Transactional(readOnly = true)
	public Train getTrainById(int id) {
		Optional<Train> trains = trainRepositry.findById(id);
		if (trains.isPresent()) {
			return trains.get();
		}
		throw new ResourceNotFoundException();
	}
	
	@Transactional
	public void insertOrModifyTrain(Train train) {
		if(trainRepositry.save(train) == null)
		throw new ResourceNotModifiedException();
	}
	
	@Transactional
	public boolean deleteTrainById(int id) {
		long count = trainRepositry.count();
		trainRepositry.deleteById(id);
		if(count>trainRepositry.count()) return true;
		else throw new ResourceNotFoundException();
	}
}
