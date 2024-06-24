package com.ayushtiwariofficial.course_apis.services;

import java.util.List;

import com.ayushtiwariofficial.course_apis.entities.Course;

public interface CourseService {

    public List<Course> getCourses();
    public Course getCourse(long CourseId);
    public String addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long CourseId);

}
