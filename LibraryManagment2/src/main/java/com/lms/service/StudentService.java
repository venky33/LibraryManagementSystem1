package com.lms.service;

import java.util.List;

import javax.validation.Valid;

import com.lms.dto.StudentDTO;
import com.lms.entity.Student;


public interface StudentService{
	
	StudentDTO addStudent(Student student);
	List<StudentDTO> getAllStudents();
	StudentDTO getStudentById(int id);
	String deleteStudent(int id);
	List<StudentDTO> getstudentByAddress(String address);  
	List<StudentDTO> getstudentByName(String name);
	Student addStudent(StudentDTO studentDTO);
	
}
