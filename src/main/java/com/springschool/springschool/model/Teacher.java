package com.springschool.springschool.model;

import com.springschool.springschool.model.enums.Field;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Teacher extends Person {
    private Field field;

    @ManyToOne
    private Lesson lesson;
}
