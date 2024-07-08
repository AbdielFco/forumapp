package com.example.forumapp.service;

import com.example.forumapp.dto.AuthRequest;
import com.example.forumapp.dto.AuthResponse;
import com.example.forumapp.model.User;
import com.example.forumapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AuthResponse login(AuthRequest authRequest) {
        User user = userRepository.findByUsername(authRequest.getUsername());
        if (user != null && passwordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
            String token = "dummy-jwt-token"; // Aquí deberías generar un token JWT real
            return new AuthResponse(token);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
