package com.example.controller;

import com.example.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("people", createPeople());
        return "home";
    }

    private List<People> createPeople() {
        List<People> people = new ArrayList<People>();
        People person1 = new People("Kirby", "Scranton", "geetar");
        People person2 = new People("Robert", "Harrisonburg", "poker");
        people.add(person1);
        people.add(person2);
        return people;
    }

}
