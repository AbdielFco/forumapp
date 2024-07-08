package com.example.forumapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.forumapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
