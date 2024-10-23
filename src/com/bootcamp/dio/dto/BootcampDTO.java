package com.bootcamp.dio.dto;

import com.bootcamp.dio.model.Course;

import java.util.List;

public class BootcampDTO {

    //private final courses;
    private String name;


    private String description;
    private List<Course> course;

    public BootcampDTO (String name, String description, List<Course> course) {
        this.name = name;
        this.description = description;
        //this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
