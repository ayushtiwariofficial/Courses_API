package com.ayushtiwariofficial.course_apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayushtiwariofficial.course_apis.entities.Course;
import com.ayushtiwariofficial.course_apis.services.CourseService;



@RestController
public class MyController {

    @Autowired
    private CourseService fetchCourses;

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.fetchCourses.getCourses();
    }

    @GetMapping("/courses/{CourseId}")
    public Course getCourse(@PathVariable String CourseId){
        return this.fetchCourses.getCourse(Long.parseLong(CourseId));
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course) {
        return this.fetchCourses.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.fetchCourses.updateCourse(course);
    }

    
}
