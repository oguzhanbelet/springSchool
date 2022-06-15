package com.springschool.springschool.controller;

import com.springschool.springschool.model.Lesson;
import com.springschool.springschool.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
@RequiredArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @GetMapping("/getLessonById")
    public Lesson getLessonById(@RequestParam Long id) {
        return lessonService.getLessonById(id);
    }

    @GetMapping("/getAllLessons")
    public List<Lesson> getAllLessons() {
        return lessonService.getLessons();
    }

    @PostMapping("/addLesson")
    public Lesson addLesson(@RequestBody Lesson lesson){
        return lessonService.saveLesson(lesson);
    }

}