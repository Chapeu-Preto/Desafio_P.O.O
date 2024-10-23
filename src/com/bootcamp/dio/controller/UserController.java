package com.bootcamp.dio.controller;

import com.bootcamp.dio.dto.UserDTO;
import com.bootcamp.dio.model.User;
import com.bootcamp.dio.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    public String login (String username, String password) {
        try {
            User user = userService.authenticate(username, password);
            return "Login sucessful. welcome, " + user.getUsername();
        } catch (RuntimeException e) {
            return "Login failed: " + e.getMessage();
        }
    }

    public String register (UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        userService.registerUser(user);
        return "User registered sucessfully !";
    }

    public UserDTO getUserInfo (Long userId) {
        User user = userService.getUserById(userId);
        return new UserDTO(user.getUsername(), user.getXp());
    }
}
