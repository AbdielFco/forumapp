package com.example.forumapp.dto;

public class TopicResponse {
    private Long id;
    private String title;
    private String message;
    private String course;
    private Long userId;

    public TopicResponse(Long id, String title, String message, String course, Long userId) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.course = course;
        this.userId = userId;
    }

    // Getters and Setters
}
