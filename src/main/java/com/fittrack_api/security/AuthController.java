package com.fittrack_api.security;

import com.fittrack_api.dto.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        return null;
    }

    @GetMapping("/welcome")
    public String userProfile() {
        return "Welcome to Fittrack";
    }

}