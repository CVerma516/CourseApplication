package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Course;

public interface Coursedao extends JpaRepository<Course,Long> {

}
