package com.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Users;
import com.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping(consumes = "application/json",value = "/add")
	public ResponseEntity<Users> addUsers(@RequestBody Users users) {
		System.out.println(users.toString());
		System.out.println("---------------hit---------------");
		if (!Objects.isNull(usersService.addUser(users))) return new ResponseEntity<Users>(HttpStatus.OK);
		else return new ResponseEntity<Users>(HttpStatus.NOT_MODIFIED);
	}
	
}
