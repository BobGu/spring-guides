package com.bobbygu.controller;

import com.bobbygu.service.SelfComplimentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${home.msg}")
    private String greeting;
    private SelfComplimentingService complimentingService;

    @Autowired
    public HomeController(SelfComplimentingService complimentingService) {
       this.complimentingService = complimentingService;
    }

    @RequestMapping("/")
    public String home(){
        return greeting;
    }

    @RequestMapping("/compliment")
    public String compliment() {
        return complimentingService.randomCompliment();
    }
}
