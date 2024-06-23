package com.example.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Student;
import com.example.Student.Services.StudentServices;

@RestController
public class Studentcontroller {
	
	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("/inset")
	public Student saveStudent(@RequestBody Student student) {
		
		Student saveStudent=studentServices.saveStudent(student);
		return saveStudent;
	}
	
	@GetMapping("/get")
	public List<Student>findAllStudent(){
		
		List <Student> studentlist = studentServices.findAll();
		return studentlist;
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		
		Student updateStudent =studentServices.updateStudent(student);
	    return updateStudent;
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		
		Student student =studentServices.findById((long)id);
		return student;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable ("id") int id) {
	
		Student student =studentServices.findById((long) id);
		studentServices.deleteStudent(student);
	}
	
	
	
}
