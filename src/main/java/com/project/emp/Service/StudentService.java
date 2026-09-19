package com.project.emp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.emp.Model.Student;
import com.project.emp.Repository.StudentRepo;

@Service
public class StudentService {
	final StudentRepo repo;
	public StudentService(StudentRepo repo) {
		this.repo=repo;
	}
	
	public Student addStudent(Student s) {
		return repo.save(s);
	}
	public void deleteStudent(int id) {
        repo.deleteById(id);
    }
	public List<Student> getAll(){
		return repo.findAll();
	}
	public Student updateStudent(Student s) {
		return repo.save(s);
	}
}
