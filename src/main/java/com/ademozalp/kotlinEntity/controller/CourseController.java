package com.ademozalp.kotlinEntity.controller;

import com.ademozalp.kotlinEntity.dto.course.CourseDto;
import com.ademozalp.kotlinEntity.dto.course.SaveCourseDto;
import com.ademozalp.kotlinEntity.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public String addCourse(@RequestBody @Valid SaveCourseDto saveCourseDto) {
        return courseService.addCourse(saveCourseDto);
    }

    @GetMapping("/get-all")
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }
}
