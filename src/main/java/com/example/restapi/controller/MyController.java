package com.example.restapi.controller;

import com.example.restapi.entities.Course;
import com.example.restapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to Courses application";
    }

    //to get all courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable("id") int id){
        return this.courseService.getCourseById(id);
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course c){
        return  this.courseService.addCourse(c);
    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course c){
        Course course=this.courseService.updateCourse(c);
        if(course.getId()==0)
            this.courseService.addCourse(c);
        return c;
    }
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable("id") int id){
        this.courseService.deleteCourse(id);
    }
}
