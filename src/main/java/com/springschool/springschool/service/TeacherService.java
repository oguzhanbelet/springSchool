package com.springschool.springschool.service;

import com.springschool.springschool.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher saveTeacher(Teacher teacher);
    Teacher findTeacherById(Long id);
    List<Teacher> findAllTeachers();
}
