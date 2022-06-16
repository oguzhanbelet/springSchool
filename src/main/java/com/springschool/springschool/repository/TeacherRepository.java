package com.springschool.springschool.repository;

import com.springschool.springschool.model.Teacher;
import com.springschool.springschool.model.dtos.TeacherDTO;
import com.springschool.springschool.model.enums.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query("select new com.springschool.springschool.model.dtos.TeacherDTO" +
            "(t.id, t.firstName, t.lastName, t.identityNumber, t.birthYear, t.field, lesson.name)" +
            " from Teacher t" +
            " inner join t.lesson lesson")
    List<TeacherDTO> getTeachers();

    @Query("select new com.springschool.springschool.model.dtos.TeacherDTO" +
            "(t.id, t.firstName, t.lastName, t.identityNumber, t.birthYear, t.field, lesson.name)" +
            " from Teacher t" +
            " inner join t.lesson lesson" +
            " where t.id=:id")
    TeacherDTO getTeacherById(Long id);

    @Modifying
    @Query("delete from Teacher t where t.id=:id")
    void deleteTeacherById(Long id);

    @Modifying
    @Query("update Teacher t set t.field=?1 where t.id=?2")
    void updateTeacherFieldById(Field field, Long id);

    @Query("select new com.springschool.springschool.model.dtos.TeacherDTO" +
            "(t.id, t.firstName, t.lastName, t.identityNumber, t.birthYear, t.field, lesson.name)" +
            " from Teacher t" +
            " inner join t.lesson lesson" +
            " where t.field=:field")
    List<TeacherDTO> getTeachersByField(Field field);
}
