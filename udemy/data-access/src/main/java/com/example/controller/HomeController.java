package com.example.controller;

import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("post", postService.getLatestPost());
        return "home";
    }

    @RequestMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    @RequestMapping("/posts/{postName}")
    public String post(@PathVariable(value="postName") String postName, Model model) {
        System.out.println(postService.findByPostName(postName));
        model.addAttribute("post", postService.findByPostName(postName));
        return "postByName";
    }
}
