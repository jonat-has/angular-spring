package com.jonathas.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathas.crudspring.model.CourseModel;
import com.jonathas.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/listcourses")    
    public List<CourseModel> list() {
        return courseRepository.findAll();
    }

}
