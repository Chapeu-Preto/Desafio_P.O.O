package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.Course;
import com.bootcamp.dio.model.Progress;
import com.bootcamp.dio.model.User;

import java.sql.SQLException;

public interface ProgressRepository {

    Progress findByUserAndCourse (User user, Course course) throws SQLException;

    void save (Progress progress);

    void update (Progress progress) throws SQLException;

}
