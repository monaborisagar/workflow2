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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_details_f")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = {@JoinColumn(referencedColumnName = "sid")},
	inverseJoinColumns = {@JoinColumn(referencedColumnName = "cid")} )
	private Collection<Course> courses = new ArrayList<Course>();
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Collection<Course> getCourses() {
		return courses;
	}
	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
}
