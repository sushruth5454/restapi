package com.example.restapi.services;

import com.example.restapi.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourseById(int id);

    Course addCourse(Course c);

    Course updateCourse(Course c);

    void deleteCourse(int id);
}
