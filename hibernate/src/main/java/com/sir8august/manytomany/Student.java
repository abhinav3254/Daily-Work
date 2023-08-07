package com.sir8august.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="student")
public class Student {
	@Id
	@Column(name="s_id")
	private int sId;
	@Column(name="s_name")
	private String studentName;
	@Column(name="s_address")
	private String studentAddress;
	@Column(name="s_phone")
	private String phone;
	
	@ManyToMany
	@JoinTable()
	List<Course> courseList;

	
}
