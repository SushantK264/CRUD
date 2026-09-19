package com.project.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.emp.Model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}