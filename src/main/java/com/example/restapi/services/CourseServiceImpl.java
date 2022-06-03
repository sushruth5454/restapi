package com.example.restapi.services;

import com.example.restapi.dao.CourseDao;
import com.example.restapi.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
//    List<Course>list;
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getCourses() {
//        return list;
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(int id) {
//        for(Course c:list){
//            if(c.getId()==id){
//                return c;
//            }
//        }
//        return new Course();
        return courseDao.findById(id).get();
    }

    @Override
    public Course addCourse(Course c) {
//        list.add(new Course(c.getId(),c.getTitle(),c.getDescription()));
//        return c;
        courseDao.save(c);
        return c;
    }

    @Override
    public Course updateCourse(Course course) {
//        for(Course c:list){
//            if(c.getId()==course.getId()){
//                c.setDescription(course.getDescription());
//                c.setTitle(course.getTitle());
//                return  c;
//            }
//        }
//        return new Course();
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(int id) {
//        for(Course c:list){
//            if(c.getId()==id)
//                list.remove(c);
//        }
        courseDao.deleteById(id);
    }
}
