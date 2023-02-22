package com.example.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
private Long id;
private String title;
private String discription;
public Course(Long id, String title, String discription) {
	super();
	this.id = id;
	this.title = title;
	this.discription = discription;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
}


}
