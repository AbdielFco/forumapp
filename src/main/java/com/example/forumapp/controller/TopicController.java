package com.example.forumapp.controller;

import com.example.forumapp.dto.TopicRequest;
import com.example.forumapp.dto.TopicResponse;
import com.example.forumapp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public ResponseEntity<List<TopicResponse>> getAllTopics() {
        return ResponseEntity.ok(topicService.getAllTopics());
    }

    @PostMapping
    public ResponseEntity<TopicResponse> createTopic(@RequestBody TopicRequest topicRequest) {
        return ResponseEntity.status(201).body(topicService.createTopic(topicRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
        return ResponseEntity.ok().build();
    }
}
