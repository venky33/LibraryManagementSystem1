package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.dto.StudentDTO;
import com.lms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	List<StudentDTO> findByAddress(String address);  
	List<StudentDTO> findByName(String name);


}
