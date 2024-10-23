package com.bootcamp.dio.service;

import com.bootcamp.dio.model.User;
import com.bootcamp.dio.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate (String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Usuário ou senha inválido.");
    }

    public void registerUser (User user) {
        userRepository.save(user);
    }

    public void addXp (User user, int xp) {
        user.addXp(xp);
        userRepository.update(user);
    }

    public User getUserById(Long userId) {
        return null;
    }
}
