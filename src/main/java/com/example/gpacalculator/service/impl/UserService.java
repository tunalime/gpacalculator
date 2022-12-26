package com.example.gpacalculator.service.impl;

import com.example.gpacalculator.model.User;
import com.example.gpacalculator.repository.UserRepository;
import com.example.gpacalculator.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.getById(id);
        existingUser.setTotalCredits(user.getTotalCredits());
        existingUser.setGpa(user.getGpa());
        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.getUserById(id);
    }
}
