package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl studentService;
	
	@GetMapping(value="/get")
	public List<Student> getStudent() {
		//redirecting to getStudent()
		return studentService.getStudent();
	}
	//get students by id
	@GetMapping(value="/getbyid/{id}")
	public Student getStudentById(@PathVariable Integer id) { 
		return studentService.getStudentById(id);
	}
	//get students by name
	@GetMapping(value="/getbyname/{name}")
	public Student getStudentByName(@PathVariable String name) { 
		return studentService.getStudentByName(name);
	}
	
	//insert a student into DB
	@PostMapping(value="/post")
	public Student postStudent(@RequestBody Student student) {
		//redirecting to getStudent()
		return studentService.postStudent(student);
	
	}
	//delete student by id
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudentById(@PathVariable Integer id) { 
		return studentService.deleteStudentById(id);
	}
	
	//update the student
	 @PutMapping(value = "/put/{id}")
	    public Student putStudent(@PathVariable Integer id, @RequestBody Student updatedStudent) {
	        return studentService.putStudent(id, updatedStudent);
	    }
}

