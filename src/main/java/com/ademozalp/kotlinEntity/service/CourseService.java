package com.ademozalp.kotlinEntity.service;

import com.ademozalp.kotlinEntity.dto.course.CourseDto;
import com.ademozalp.kotlinEntity.dto.course.SaveCourseDto;
import com.ademozalp.kotlinEntity.model.Course;
import com.ademozalp.kotlinEntity.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public String addCourse(SaveCourseDto saveCourseDto) {
        courseRepository.save(SaveCourseDto.convert(saveCourseDto));
        return "Course added successfully!";
    }

    public List<CourseDto> getAllCourses() {
        return  courseRepository.findAll()
                .stream().map(CourseDto::convert).toList();
    }

    public Course getCourseByIdForOtherService(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found!"));
    }
}
