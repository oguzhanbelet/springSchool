package com.springschool.springschool.repository;

import com.springschool.springschool.model.Student;
import com.springschool.springschool.model.dtos.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select new com.springschool.springschool.model.dtos.StudentDTO" +
            "(s.id, s.firstName, s.lastName, s.identityNumber, s.birthYear, s.studentNumber, lesson.name)" +
            " from Student s" +
            " inner join s.lessons lesson")
    List<StudentDTO> getStudents();

    @Query("select new com.springschool.springschool.model.dtos.StudentDTO" +
            "(s.id, s.firstName, s.lastName, s.identityNumber, s.birthYear, s.studentNumber, lesson.name)" +
            " from Student s" +
            " inner join s.lessons lesson" +
            " where s.id =: id")
    StudentDTO getStudentById(Long id);

    @Modifying
    @Query("delete from Student s where s.id=:id")
    void deleteStudentById(Long id);

    @Modifying
    @Query("update Student s set s.firstName=?1, s.lastName=?2 where s.id=?3")
    void updateStudentNameById(String firstName, String lastName, Long id);
}
