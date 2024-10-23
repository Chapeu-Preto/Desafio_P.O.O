package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.Course;
import com.bootcamp.dio.model.Progress;
import com.bootcamp.dio.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgressRepositoryImpl implements ProgressRepository {

    private final Connection connection;

    public ProgressRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Progress findByUserAndCourse(User user, Course course) throws SQLException {
        Progress progress = null;
        String sql = "SELECT * FROM progress WHERE user_id = ? AND course_id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, user.getId());
            stmt.setLong(2, course.getId());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                progress = new Progress();
                progress.setId(rs.getLong("id"));
                progress.setCompleted(rs.getBoolean("completed"));
                progress.setUser(user);
                progress.setCourse(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return progress;
    }

    @Override
    public void save(Progress progress) {
        String sql = "INSERT INTO progress (user_id, course_id, completed) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, progress.getUser().getId());
            stmt.setLong(2, progress.getCourse().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Progress progress) throws SQLException {
        String sql = "UPDATE progress SET completed = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setBoolean(1, progress.isCompleted());
            stmt.setLong(2, progress.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
