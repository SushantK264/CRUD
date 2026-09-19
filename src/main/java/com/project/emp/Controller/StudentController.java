package com.project.emp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.emp.Model.Student;
import com.project.emp.Service.StudentService;

@RestController
public class StudentController {
	final StudentService service;
	public StudentController(StudentService service) {
		this.service=service;
	}
	
	@PostMapping("/add")
	public Student Add (Student s) {
		return service.addStudent(s);
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(Student s) {
		service.deleteStudent(s);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/update")
	public Student update(Student s) {
		return service.updateStudent(s);
	}
}
