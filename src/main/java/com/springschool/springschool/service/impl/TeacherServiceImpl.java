package com.springschool.springschool.service.impl;

import com.springschool.springschool.model.Teacher;
import com.springschool.springschool.repository.TeacherRepository;
import com.springschool.springschool.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher findTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(new Teacher());
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }
}
