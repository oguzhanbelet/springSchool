package com.springschool.springschool.service;

import com.springschool.springschool.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student getStudent(Long id);
    List<Student> getStudents();
    void deleteStudent(Long id);
    void updateStudentById(Long id);
}
