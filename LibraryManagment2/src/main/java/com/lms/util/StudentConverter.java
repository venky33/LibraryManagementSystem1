package com.lms.util;

//import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.dto.StudentDTO;
import com.lms.entity.Student;


@Component
public class StudentConverter {

	public Student convertToStudent(StudentDTO studentDTO)
	{
		Student student=new Student();
		if (studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO, student);
		}
		return student;
		
	}

	 public  StudentDTO convertToStudentDTO(Student student)
	{
		StudentDTO studentDTO= new StudentDTO();
		if (student!=null)
		{
			BeanUtils.copyProperties(student, studentDTO);
		}
		return studentDTO;
		
	}
}