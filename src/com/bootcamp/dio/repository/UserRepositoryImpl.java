package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void save (User user) {
        //Simulando a atualização ou inserção
        Optional<User> existingUser = users.stream().filter(u -> u.getId().equals(user.getId())).findFirst();
        if (existingUser.isPresent()) {
            users.remove(existingUser.get());
        }
        users.add(user);
    }

    @Override
    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public User findByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(User user) {

    }
}
