package com.springschool.springschool.model.dtos;

import com.springschool.springschool.model.enums.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private Date birthYear;
    private Field field;
    private String lessonName;
}
