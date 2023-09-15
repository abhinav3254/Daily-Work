package com.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.entity.Users;

import jakarta.persistence.Column;


@Component
public class CustomUserDetail implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	private String username;
	
	@Column(length = 2000)
	private String password;
	
	private String roles;
	
	private List<SimpleGrantedAuthority> list;
	
	
	
	
	public CustomUserDetail() {
		super();
	}

	public CustomUserDetail(Users users) {
		this.username = users.getUsername();
		this.password = users.getPassword();
		this.list = Arrays.stream(users.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}
	
	public String getRoles() {
		return roles;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	
	
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.list;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
