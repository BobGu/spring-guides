package com.example;

import com.example.entities.Post;
import com.example.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DataAccessApplication {

	@Autowired
	PostRepository postRepository;

	private static final Logger logger = LoggerFactory.getLogger(DataAccessApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DataAccessApplication.class, args);
	}

	@PostConstruct
	void seePosts(){
		logger.info("seePosts method called");
		for(Post post: postRepository.findAll()) {
			logger.info(post.toString());
		}
	}
}
