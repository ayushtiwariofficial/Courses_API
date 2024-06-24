package com.ayushtiwariofficial.course_apis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    @GetMapping("/Courses")
    public List<Course> getCourses(){
        
    }
}
