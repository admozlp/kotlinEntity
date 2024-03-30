package com.ademozalp.kotlinEntity.controller;

import com.ademozalp.kotlinEntity.dto.student.SaveStudentDto;
import com.ademozalp.kotlinEntity.dto.student.StudentDto;
import com.ademozalp.kotlinEntity.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String addStudent(@RequestBody @Valid SaveStudentDto saveStudentDto) {
        return studentService.saveStudent(saveStudentDto);
    }

    @GetMapping("/get-all")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
