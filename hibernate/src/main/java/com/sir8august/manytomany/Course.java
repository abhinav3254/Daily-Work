package com.sir8august.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity(name="course")
public class Course {
	@Id
	@Column(name="c_id")
	private int cId;
	@Column(name="c_name")
	private String courseName;
	@Column(name="c_duration")
	private String duration;
	@Column(name="c_faculty")
	private String faculty;
	
	
}
