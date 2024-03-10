package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	
//Abstract form
	public List<Student> getStudent() {
		return studentRepository.findAll();
		
	}

	public Student getStudentById(Integer id) {
		Optional<Student> student= studentRepository.findById(id);
		return student.orElse(null);
	}

	public Student getStudentByName(String name) {
		
		Student student= studentRepository.findByName(name);
		return student;
	}

	public Student postStudent(Student student) {
		Student s=studentRepository.save(student);
		return s;
	}

	public String deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		return "Delete Success";
	}
	
	public Student putStudent(Integer id, Student updatedStudent) {
        Optional<Student> existingStudentOptional = studentRepository.findById(id);

        if (existingStudentOptional.isPresent()) {
            Student existingStudent = existingStudentOptional.get();

           
            existingStudent.setName(updatedStudent.getName());

        
            Student updatedStudentResult = studentRepository.save(existingStudent);
            return updatedStudentResult;
        } else {
            
            return null; 
        }

	}

}
