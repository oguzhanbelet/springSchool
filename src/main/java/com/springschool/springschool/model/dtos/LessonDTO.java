package com.springschool.springschool.model.dtos;

import com.springschool.springschool.model.enums.Field;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonDTO {
    private Long id;
    private String name;
    private String teacherFirstName;
    private String teacherLastName;
    private Field teacherField;
    private String studentFirstName;
    private String studentLastName;
    private Integer studentNumber;
}
