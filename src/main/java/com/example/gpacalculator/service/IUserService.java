package com.example.gpacalculator.service;

import com.example.gpacalculator.model.User;
import java.util.List;

public interface IUserService {

    public User createUser(User user);

    public User updateUser(Long id, User user);

    public void deleteUser(Long id);

    public List<User> getAllUsers();

    public User getUserById(Long id);
}
