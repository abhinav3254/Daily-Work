package com.service;


import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.entity.Users;

@Service
public class UsersService {
	
	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Users getByUsername(String username,String password) {
		Users users = usersDao.findByUsername(username);
		if (Objects.isNull(users)) return null; 
		else return users;
	}
	
	
	@Transactional(readOnly = true)
	public Users getByUsernameandpassword(String username,String password) {
		Optional<Users> users = usersDao.findByUsernameAndPassword(username, password);
		if (users.isEmpty()) return null; 
		else return users.get();
	}
	
	@Transactional
	public boolean addUser(Users users) {
		users.setPassword(passwordEncoder.encode(users.getPassword()));
		System.out.println(users.getPassword());
		System.out.println("-----------------users service add user-----------------------");
		Users u = usersDao.save(users);
		
		if (Objects.isNull(u)) return false;
		else return true;
	}
	
}
