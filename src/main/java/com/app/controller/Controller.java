package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentServiceImp;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {

	private final StudentServiceImp studentServiceImp;

	
	@CrossOrigin( origins  = "http://localhost:9090")	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentServiceImp.getStudents();
	}
}
