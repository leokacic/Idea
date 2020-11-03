package com.example.springh2.service;

import com.example.springh2.model.Student;
import com.example.springh2.repository.StudentRepository;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    MeterRegistry meterRegistry;

    Counter setStudentCounter;

    private void init() {
        setStudentCounter = Counter.builder("set.counter").register(meterRegistry);
    }

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student> studenti = studentRepository.findAll();
        return studenti;
    }

    public void setStudent(String name, String surname){
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        studentRepository.save(student);
        setStudentCounter.increment();
    }
}
