package com.example.forumapp.controller;

import com.example.forumapp.dto.AuthRequest;
import com.example.forumapp.dto.AuthResponse;
import com.example.forumapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok(authService.login(authRequest));
    }
}
