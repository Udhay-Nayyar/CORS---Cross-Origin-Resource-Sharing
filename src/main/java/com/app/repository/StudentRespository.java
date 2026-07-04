package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Student;

public interface StudentRespository extends JpaRepository<Student,Long> {

}
