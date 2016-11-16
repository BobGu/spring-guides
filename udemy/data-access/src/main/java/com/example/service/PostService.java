package com.example.service;

import com.example.entities.Post;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatestPost() {
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    public Post findByPostName(String postName) {
        return postRepository.findByTitle(postName);
    }
}
