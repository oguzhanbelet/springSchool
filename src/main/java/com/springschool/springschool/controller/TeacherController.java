package com.springschool.springschool.controller;

import com.springschool.springschool.model.Teacher;
import com.springschool.springschool.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/findTeacherById")
    public Teacher findTeacherById(@RequestParam Long id){
        return teacherService.findTeacherById(id);
    }

    @GetMapping("/findAllTeachers")
    public ResponseEntity<List<Teacher>> findAllTeachers(){
        return ResponseEntity.ok(teacherService.findAllTeachers());
    }

}
