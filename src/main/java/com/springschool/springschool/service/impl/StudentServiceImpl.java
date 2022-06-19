package com.springschool.springschool.service.impl;

import com.springschool.springschool.model.Student;
import com.springschool.springschool.repository.StudentRepository;
import com.springschool.springschool.service.StudentService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("this student does not exist!"));
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudentById(String firstName, String lastName, Long id) {
        studentRepository.updateStudentNameById(firstName,lastName,id);
    }
}
