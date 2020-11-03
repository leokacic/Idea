package com.example.springbootrentacar.service;

import com.example.springbootrentacar.model.Student;

public interface StudentService {

    Student save(Student student);
    Student fetchStudentById(int id);
}
