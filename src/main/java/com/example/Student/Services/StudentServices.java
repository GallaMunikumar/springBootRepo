package com.example.Student.Services;

import java.util.List;

import com.example.Student.Entity.Student;

public interface StudentServices {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(Student student);
	public Student findById(Long id);
	public List<Student>findAll();

}
