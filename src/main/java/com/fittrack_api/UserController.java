package com.fittrack_api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.fittrack_api.User;
import com.fittrack_api.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Get All User (GET API)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
