package com.fittrack_api.security;

import com.fittrack_api.dto.LoginRequest;
import com.fittrack_api.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        //return user.getEmail().equals("email") && user.getPassword().equals("password");
        return true;
    }

    @GetMapping("/welcome")
    public String userProfile() {
        return "Welcome to Fittrack";
    }

}