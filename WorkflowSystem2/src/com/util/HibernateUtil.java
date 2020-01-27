package com.util;

import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.model.*;
import com.model.Course;
import com.model.Student;


public class HibernateUtil {
	
	
	
	private static SessionFactory sessionFactory;
	private static Session session;
 
	public static Session createSession2() {
		
		
			SessionFactory sf=new Configuration()
					.addAnnotatedClass(Student.class).addAnnotatedClass(Course.class)
					.configure("hibernate.cfg.xml")
					.buildSessionFactory();
			Session session=sf.openSession();
			return session;
		}
	}
	
		
		
	
		
	


