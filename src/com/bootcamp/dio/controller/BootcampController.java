package com.bootcamp.dio.controller;

import com.bootcamp.dio.dto.BootcampDTO;
import com.bootcamp.dio.model.Bootcamp;
import com.bootcamp.dio.model.User;
import com.bootcamp.dio.service.BootcampService;

import java.util.Collections;

public class BootcampController {
    private final BootcampService bootcampService;

    public BootcampController(BootcampService bootcampService) {
        this.bootcampService = bootcampService;
    }

    public String enrollUser (User userId, Long bootcampId) {
        try {
            bootcampService.enrollUser(userId, bootcampId);
            return "User enrolled in the bootcamp sucessfully !";
        } catch (RuntimeException e) {
            return "Failed to enroll: " + e.getMessage();
        }
    }

    public BootcampDTO getBootcampInfo(Long bootcampId) {
      Bootcamp bootcamp = bootcampService.getBootcampById(bootcampId);
      return new BootcampDTO(bootcamp.getName(), bootcamp.getDescription(), Collections.singletonList((com.bootcamp.dio.model.Course) bootcamp.getCourses()));
    }
}
