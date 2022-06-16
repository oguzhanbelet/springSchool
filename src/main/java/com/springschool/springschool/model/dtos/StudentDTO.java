package com.springschool.springschool.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private Date birthYear;
    private Integer studentNumber;
    private String lessonName;
}
