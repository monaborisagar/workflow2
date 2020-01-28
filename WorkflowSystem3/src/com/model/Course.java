package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="coursep")
public class Course {
	
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="cid")
	private int cid;
	
	@Column(name="course_name")
	private String courseName;
	
	public Course() {
	}
	public Course(String courseName) {
		
		this.cid = cid;
		this.courseName = courseName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
	
}
