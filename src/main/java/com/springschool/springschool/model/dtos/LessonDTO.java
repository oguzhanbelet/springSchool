package com.springschool.springschool.model.dtos;

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
    private String teacherName;
    private String studentName;
}
