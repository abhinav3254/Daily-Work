package com.model;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.entity.Users;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = usersDao.findByUsername(username);
		if (users != null) return new CustomUserDetail(users);
		throw new UsernameNotFoundException("user doesn't exist "+username);
	}

}
