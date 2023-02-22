package com.example.springboot.services;

import java.util.List;

import com.example.springboot.entity.Course;

public interface CourseServices {

	public List<Course> getCourse();
	
	public Course getcourseid(Long courseid);
	
	public Course addCourse(Course course);
	
	public Course UpdateCourse(Course course);
	public void DeleteCourse(Long parseLong);
	
	
}
