package com.example.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springboot.dao.Coursedao;
import com.example.springboot.entity.Course;
@Service
public class CourseServiceImpl implements CourseServices {
	
	//List<Course> list;
	@Autowired
	private Coursedao coursedao;
	public CourseServiceImpl()
	{
//	  list=new ArrayList<>();
//	  list.add(new Course(12L,"java ","This is java language"));
//	  list.add(new Course(13L,"Python ","This is Python language"));
//	  
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}

	//@SuppressWarnings("deprecation")
	@Override
	public Course getcourseid(Long courseid) {
	//	Course c = null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseid)
//			{
//				c= course;
//				break;
//			}
//		}
		return coursedao.getReferenceById(courseid);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public Course UpdateCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		coursedao.save(course);
		return course;
	}

/**	@Override
	public Course DeleteCourse(Long parseLong) {
		// TODO Auto-generated method stub
		Course l=null;
		l=(Course) this.list.stream().filter(e -> e.getId()!= parseLong).collect(Collectors.toList());
		return l;
	}

	**/

	public void DeleteCourse(Long parseLong) { 

	       // list.remove(id);
		
		 

	        Course entity = coursedao.getReferenceById(parseLong);
	        coursedao.delete(entity);
	    }	
	
	}
