package com.bootcamp.dio.service;

import com.bootcamp.dio.model.Course;
import com.bootcamp.dio.model.Progress;
import com.bootcamp.dio.model.User;
import com.bootcamp.dio.repository.ProgressRepository;

import java.sql.SQLException;

public class ProgressService {
    private final ProgressRepository progressRepository;
    private final UserService userService;

    public ProgressService (ProgressRepository progressRepository, UserService userService) {
        this.progressRepository = progressRepository;
        this.userService = userService;
    }

    public void completeCourse (User user, Course course) throws SQLException {
        Progress progress = progressRepository.findByUserAndCourse(user, course);

        if (progress != null) {
            progress.setCompleted(true);
            userService.addXp(user, course.getXpReward());
            progressRepository.update(progress);
        }
    }
}