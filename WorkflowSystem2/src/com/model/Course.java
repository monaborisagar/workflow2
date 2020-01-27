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
@Table(name="course_details_f")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="course_name")
	private String courseName;
	
	@ManyToMany(mappedBy = "courses")
	private Collection<Student> students = new ArrayList<Student>();
	
	public Collection<Student> getStudents() {
		return students;
	}
	public void setStudents(Collection<Student> students) {
		this.students = students;
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
