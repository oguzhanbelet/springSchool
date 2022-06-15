package com.springschool.springschool.service;

import com.springschool.springschool.model.Lesson;

import java.util.List;

public interface LessonService {
    Lesson saveLesson(Lesson lesson);
    void deleteLessonById(Long id);
    List<Lesson> getLessons();
    Lesson getLessonById(Long id);
}
