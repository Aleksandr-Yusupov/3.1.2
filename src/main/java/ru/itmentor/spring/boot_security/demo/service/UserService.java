package ru.itmentor.spring.boot_security.demo.service;


import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;
public interface UserService {
    List<User> getAllUsers();
    User getUserByLogin(String login);
    User getUserById(long id);
    User addUser(User newUser);
    User editUser(User user);
    void deleteUser(User deleteUser);
}