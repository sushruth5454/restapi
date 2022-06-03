package com.example.restapi.entities;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Course {
    @Id
    private int id;
    private String title;
    private String description;
}
