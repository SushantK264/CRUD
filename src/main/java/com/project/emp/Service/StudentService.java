package com.project.emp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.emp.Model.Student;
import com.project.emp.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired StudentRepo repo;
	
	public Student addStudent(Student s) {
		return repo.save(s);
	}
	public void deleteStudent(Student s) {
		repo.delete(s);
	}
	public List<Student> getAll(){
		return repo.findAll();
	}
	public Student updateStudent(Student s) {
		return repo.save(s);
	}
}
