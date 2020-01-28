package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="studentCoursep")
public class StudentCourse {
	

	 @Id @GeneratedValue
	   @Column(name = "id")
	   private int id;
	
	
	@Column(name="c_id")
	private int c_id;

	@Column(name="s_id")
	private int s_id;

	
	  public int getS_id() { return s_id; }
	  public void setS_id(int s_id) { this.s_id = s_id; }
	  public int getC_id() { return c_id; }
	  public void setC_id(int c_id) { this.c_id = c_id; }
	 
}
