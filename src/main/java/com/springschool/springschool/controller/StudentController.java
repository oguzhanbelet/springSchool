package com.springschool.springschool.controller;

import com.springschool.springschool.model.Student;
import com.springschool.springschool.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudentById(@RequestParam Long id){
        return studentService.getStudent(id);
    }

    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}
