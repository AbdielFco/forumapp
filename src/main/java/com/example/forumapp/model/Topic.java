package com.example.forumapp.model;

import javax.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String message;
    private String course;
    private Long userId;

    // Getters and Setters
}
