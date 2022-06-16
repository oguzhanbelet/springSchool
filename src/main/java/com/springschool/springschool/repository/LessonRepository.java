package com.springschool.springschool.repository;

import com.springschool.springschool.model.Lesson;
import com.springschool.springschool.model.dtos.LessonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    @Query("select new com.springschool.springschool.model.dtos.LessonDTO" +
            "(l.id, l.name, t.firstName, t.lastName, t.field, s.firstName, s.lastName, s.studentNumber)" +
            " from Lesson l" +
            " inner join l.students s" +
            " inner join l.teachers t")
    List<LessonDTO> getLessons();
}
