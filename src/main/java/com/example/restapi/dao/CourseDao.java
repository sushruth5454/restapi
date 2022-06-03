package com.example.restapi.dao;

import com.example.restapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Integer> {
}
