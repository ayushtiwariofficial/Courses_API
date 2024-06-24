package com.ayushtiwariofficial.course_apis.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ayushtiwariofficial.course_apis.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "Core Java", "This is a good course for java beginners"));
        list.add(new Course(2, "Spring Boot", "Backend Development Course for Beginners"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long CourseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == CourseId) {
                c = course;
                break;
            }
        }

        return c;
    }

    @Override
    public String addCourse(Course course) {
        list.add(course);
        return "Course Added Successfully!";
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(c -> {
            if (c.getId() == course.getId()) {
                c.setName(course.getName());
                c.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long CourseId) {
        list = list.stream().filter(e -> e.getId()!=CourseId).collect(Collectors.toList());
    }
}
