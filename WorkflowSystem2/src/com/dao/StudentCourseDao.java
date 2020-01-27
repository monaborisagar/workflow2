package com.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;


import com.model.Course;
import com.model.Student;
import com.util.HibernateUtil;

public class StudentCourseDao {

	public static void addCourses(Course c)
	{
		Session session=HibernateUtil.createSession2();
		System.out.println("1");
		Transaction tr=session.beginTransaction();
		System.out.println("2");
		session.save(c);
		tr.commit();
		session.close();
	}
	public static void addStudent(Student s)
	{
		Session session=HibernateUtil.createSession2();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}
	
    
    
}
