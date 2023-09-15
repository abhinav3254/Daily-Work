package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Users;

public interface UsersDao extends JpaRepository<Users, Integer> {
	
	@Query(nativeQuery = true,value = "select * from users where username =:username and password =:password")
	Optional<Users> findByUsernameAndPassword(String username,String password);
	
	Users findByUsername(String username);
}
