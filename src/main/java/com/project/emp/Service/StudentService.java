package com.project.emp.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.project.emp.Exception.StudentNotFoundException;
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
        if (!repo.existsById(id)) {
            throw new StudentNotFoundException("Cannot delete. Student not found with ID: " + id);
        }
        repo.deleteById(id);
    }
	
	
	public List<Student> getAll(){
		return repo.findAll();
	}
	public Student updateStudent(Student s) {
		return repo.save(s);
	}
}
