package com.example.springboot.courseapi.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository <Course, String>{

    public List<Course> findByName (String name); //radi bez implementacije
    public List<Course> findByDescription (String description);

    public List<Course> findByTopicId (String topicId);
}
