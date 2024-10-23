package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.User;

public interface UserRepository extends Repository <User, Long> {
    User findByUsername(String username);

    void update(User user);
}
