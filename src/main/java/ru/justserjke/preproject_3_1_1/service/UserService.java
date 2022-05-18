package ru.justserjke.preproject_3_1_1.service;

import ru.justserjke.preproject_3_1_1.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    User findById(Long id);
}
