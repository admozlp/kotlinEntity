package com.ademozalp.kotlinEntity.service;

import com.ademozalp.kotlinEntity.dto.student.SaveStudentDto;
import com.ademozalp.kotlinEntity.dto.student.StudentDto;
import com.ademozalp.kotlinEntity.model.Course;
import com.ademozalp.kotlinEntity.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final CourseService courseService;

    public StudentService(StudentRepository studentRepository, CourseService courseService) {
        this.studentRepository = studentRepository;
        this.courseService = courseService;
    }

    public String saveStudent(SaveStudentDto saveStudentDto) {
        Course course = courseService.getCourseByIdForOtherService(saveStudentDto.getCourseId());
        studentRepository.save(SaveStudentDto.convert(saveStudentDto,course));
        return "Student saved";
    }
    
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll()
                .stream().map(StudentDto::convert).toList();
    }
}
