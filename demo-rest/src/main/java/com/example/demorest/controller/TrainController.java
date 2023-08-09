package com.example.demorest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demorest.entity.Train;
import com.example.demorest.exception.ResourceNotModifiedException;
import com.example.demorest.service.TrainService;

/*
@Controller
@ResponseBody
*/
@RestController
public class TrainController {
	@Autowired
	TrainService trainService;
	
	@GetMapping(value = "api/v1/train/getAll",produces="application/json")
	public List<Train> getAllTrains() {
		List<Train> trainList = trainService.getAllTrains();
//		if (trainList!=null) return trainList;
		//return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
		return trainList;
	}
	
	@GetMapping(value = "api/v1/train/getAll/{id}",produces="application/json")
	public ResponseEntity<Train> getTrainById(@PathVariable String id) {
		Train train = trainService.getTrainById(Integer.parseInt(id));
		if (train!=null) return new ResponseEntity<Train>(train,HttpStatus.OK);
		return new ResponseEntity<Train>(train,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value = "api/v1/train/addTrain",consumes = "application/json")
	public HttpStatus insertTrain(@RequestBody Train train) {
		Train train2 = train;
		trainService.insertOrModifyTrain(train2);
		return HttpStatus.OK;
	}
	
	@PutMapping(value = "api/v1/train/updateTrain",consumes = "application/json")
	public HttpStatus updateTrain(@RequestBody Train train) {
		Train train2 = train;
		trainService.insertOrModifyTrain(train2);
		return HttpStatus.OK;
	}
	
	@DeleteMapping(value = "api/v1/train/deleteTrain/{id}")
	public HttpStatus deleteTrain(@PathVariable String id) {
		trainService.deleteTrainById(Integer.parseInt(id));
		return HttpStatus.OK;
	}
	
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notModifiedExceptionHandler() {
		return HttpStatus.NOT_MODIFIED;
	}
}
