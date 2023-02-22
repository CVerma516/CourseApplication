package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Course;
import com.example.springboot.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseservices;
	
	@GetMapping("/home")
	public String home()
	{
		return "my home page";
	}
    @GetMapping("/course")
	public List<Course> getCourse()
	{
		return this.courseservices.getCourse();
		
	}
    @GetMapping("/course/{courseid}")
	public Course getcourseid(@PathVariable String courseid)
	{
		return this.courseservices.getcourseid(Long.parseLong(courseid));
	}
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course)
    {
    	return this.courseservices.addCourse(course);
    }
	@PutMapping("/course")
    public Course UpdateCourse(@RequestBody Course course)
    {
    	return this.courseservices.UpdateCourse(course);
    }
	/**@DeleteMapping("/course/{courseid}")
	public ResponseEntity<HttpStatus> DeleteCourse(@PathVariable String courseid)
    {
		try {
    	 this.courseservices.DeleteCourse(Long.parseLong(courseid));
    	 return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	
	
    }
**/
	@DeleteMapping("/course/{courseid}")
	public  void DeleteCourse(@PathVariable String courseid)
	{
		 this.courseservices.DeleteCourse(Long.parseLong(courseid));
		
	}
	
}
