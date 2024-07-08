package com.example.forumapp.service;

import com.example.forumapp.dto.TopicRequest;
import com.example.forumapp.dto.TopicResponse;
import com.example.forumapp.model.Topic;
import com.example.forumapp.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<TopicResponse> getAllTopics() {
        return topicRepository.findAll().stream()
                .map(topic -> new TopicResponse(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCourse(), topic.getUserId()))
                .collect(Collectors.toList());
    }

    public TopicResponse createTopic(TopicRequest topicRequest) {
        Topic topic = new Topic();
        topic.setTitle(topicRequest.getTitle());
        topic.setMessage(topicRequest.getMessage());
        topic.setCourse(topicRequest.getCourse());
        topic.setUserId(topicRequest.getUserId());
        topic = topicRepository.save(topic);
        return new TopicResponse(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCourse(), topic.getUserId());
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
