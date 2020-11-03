package com.example.springbootrentacar.controller;

import com.example.springbootrentacar.model.Student;
import com.example.springbootrentacar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String greeting(){
        return "Hello";
    }

    @PostMapping("/hello")
    public String greeting2(){
        return "Hello from post";
    }

    @PostMapping("/student")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/student")
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
        Student student = studentService.fetchStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }
}
