package com.example.springbootrentacar.repository;

import com.example.springbootrentacar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

}
