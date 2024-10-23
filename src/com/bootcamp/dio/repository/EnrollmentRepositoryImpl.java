package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepositoryImpl implements EnrollmentRepository {

    private List<Enrollment> enrollments = new ArrayList<>();

    @Override
    public void save(Enrollment enrollment) {
        enrollments.removeIf(e -> e.getId().equals(enrollment.getId()));
        enrollments.add(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        return enrollments.stream()
                .filter(enrollment -> enrollment.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Enrollment> findAll() {
        return new ArrayList<>(enrollments);
    }

    @Override
    public void delete(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }
}
