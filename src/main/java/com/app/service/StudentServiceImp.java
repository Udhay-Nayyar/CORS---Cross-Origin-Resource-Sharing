package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRespository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService{

	private final StudentRespository studentRepository;
	

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
		
	}

}
