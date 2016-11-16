package com.example.service;

import com.example.entities.Author;
import com.example.entities.Post;
import com.example.repository.AuthorRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData() {
        Author author = new Author("Robert", "Gu");
        authorRepository.save(author);

        Post post1 = new Post("Learn this one secret trick to 10x your development", "Scarrrry");
        post1.setAuthor(author);
        Post post2 = new Post("The Third Bricklayer", "8th light ladadadadadadadadaddadadadadadad");
        post2.setAuthor(author);

        postRepository.save(post1);
        postRepository.save(post2);
    }
}
