package com.example.forumapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.forumapp.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
