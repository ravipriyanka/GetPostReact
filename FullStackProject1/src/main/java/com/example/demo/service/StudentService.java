package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;
//To acheive the abstraction//from the client
public interface StudentService {
	public List<Student> getStudent();
	public Student getStudentById(Integer id) ;
	public Student getStudentByName(String name) ;
	public Student postStudent(Student student) ;
	public String deleteStudentById(Integer id) ;
	public Student putStudent(Integer id, Student updatedStudent);
	
    	
    
	
}

