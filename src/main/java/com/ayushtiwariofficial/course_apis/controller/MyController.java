package com.ayushtiwariofficial.course_apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    // Just for testing API (Home Page)
    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    // For Fetching details of all courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.fetchCourses.getCourses();
    }

    // For fetching the details of a single course through its ID
    @GetMapping("/courses/{CourseId}")
    public Course getCourse(@PathVariable String CourseId){
        return this.fetchCourses.getCourse(Long.parseLong(CourseId));
    }

    // For adding a new course
    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course) {
        return this.fetchCourses.addCourse(course);
    }

    // For updating any course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.fetchCourses.updateCourse(course);
    }
    
    // For deleting any particular course through its ID
    @DeleteMapping("/courses/{CourseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String CourseId)
    {
        try {
            this.fetchCourses.deleteCourse(Long.parseLong(CourseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
