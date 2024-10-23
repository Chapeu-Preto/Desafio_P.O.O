package com.bootcamp.dio.service;

import com.bootcamp.dio.model.Bootcamp;
import com.bootcamp.dio.model.Enrollment;
import com.bootcamp.dio.model.User;
import com.bootcamp.dio.repository.BootcampRepository;
import com.bootcamp.dio.repository.EnrollmentRepository;

public class BootcampService {

    private final BootcampRepository bootcampRepository;
    private final EnrollmentRepository enrollmentRepository;

    public BootcampService (BootcampRepository bootcampRepository, EnrollmentRepository enrollmentRepository) {
        this.bootcampRepository = bootcampRepository;
        this.enrollmentRepository = enrollmentRepository;
    }

    public void enrollUser (User user, Long bootcamp) {

        Enrollment enrollment = new Enrollment();

        enrollment.setUser("user");
        enrollment.setBootcamp("bootcamp");
        enrollmentRepository.save(enrollment);
    }

    public Bootcamp getBootcampById(Long bootcampId) {
        return null;
    }
}
