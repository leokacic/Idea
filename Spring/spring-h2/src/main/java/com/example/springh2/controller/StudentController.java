package com.example.springh2.controller;

import com.example.springh2.model.Student;
import com.example.springh2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){

        return studentService.getStudents();
    }

    @GetMapping("/students/name/{name}/surname/{surname}")
    public void getStudents(@PathVariable("name") String name, @PathVariable("surname") String surname){
        studentService.setStudent(name,surname);
    }
}
