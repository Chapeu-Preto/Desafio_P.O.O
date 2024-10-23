package com.bootcamp.dio.model;

import java.util.List;

public class Progress {

    private Long id;
    private User user;
    private Course course;
    private boolean completed;
    private List<String> completedLessons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<String> getCompletedLessons() {
        return completedLessons;
    }

    public void setCompletedLessons(List<String> completedLessons) {
        this.completedLessons = completedLessons;
    }
}
