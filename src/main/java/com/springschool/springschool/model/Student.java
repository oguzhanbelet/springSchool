package com.springschool.springschool.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;


@Entity
@Data
public class Student extends Person {
    private Integer studentNumber;

    @ManyToMany
    private List<Lesson> lessons;
}
