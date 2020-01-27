package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentCourseDao;
import com.model.Course;
import com.model.Student;

@WebServlet("/ActionController")
public class ActionController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("Insert")) {

			Course course1 = new Course();
			course1.setCourseName(request.getParameter("cname1"));
			Course course2 = new Course();
			course2.setCourseName(request.getParameter("cname2"));
			Course course3 = new Course();
			course3.setCourseName(request.getParameter("cname3"));

			Collection<Course> col = new ArrayList<Course>();
			col.add(course1);
			col.add(course2);
			col.add(course3);

			Student s1 = new Student();
			s1.setFname(request.getParameter("fname"));
			s1.setLname(request.getParameter("lname"));
			System.out.println("course");
			System.out.println("" + course1 + course2 + course3);
			s1.setCourses(col);
			
			StudentCourseDao.addStudent(s1);

			System.out.println("done");

		}
	}

}
