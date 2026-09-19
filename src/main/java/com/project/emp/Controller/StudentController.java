package com.project.emp.Controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.emp.Model.Student;
import com.project.emp.Service.StudentService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@Validated
public class StudentController {
	final StudentService service;
	
	public StudentController(StudentService service) {
		this.service=service;
	}
	
	@PostMapping("/add")
	public Student add (@Valid @RequestBody Student s) {
		return service.addStudent(s);
	}
	
	@DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable @Min(value=0,message="Id must be Positive") int id) {
        service.deleteStudent(id);
    }
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/update")
	public Student update(@Valid @RequestBody Student s) {
		return service.updateStudent(s);
	}
}
