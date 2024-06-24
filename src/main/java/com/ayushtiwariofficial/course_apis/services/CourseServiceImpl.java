package com.ayushtiwariofficial.course_apis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ayushtiwariofficial.course_apis.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
    
    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1, "Core Java", "This is a good course for java beginners"));
        list.add(new Course(2, "Spring Boot", "Backend Development Course for Beginners"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
    @Override
    public Course getCourse(long CourseId){
        Course c = null;
        for(Course course : list)
        {
            if(course.getId() == CourseId )
            {
                c = course;
            }
        }

        return c;
    }
}
