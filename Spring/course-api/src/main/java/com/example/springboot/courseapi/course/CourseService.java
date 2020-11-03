package com.example.springboot.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

/*    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework","Spring Framework Description"),
            new Topic("java", "Core Java","Core Java Description"),
            new Topic("javascript", "JavaScript","JavaScript Description")
    ));*/

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach (courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);
    }


    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        /*for(int i = 0 ; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
