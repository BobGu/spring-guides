package com.example.controller;

import com.example.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("people", createPeople());
        return "home";
    }

    @RequestMapping("/get/{slug}")
    public String getPerson(@PathVariable(value="slug") String slug) throws Exception {
        People people = null;
        if( people == null ) throw new Exception("We couldn't find the post with slug" + slug);
        return "people";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest req, Exception exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "peopleError";
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
