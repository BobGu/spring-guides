package com.example.repository;

import com.example.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();
}
