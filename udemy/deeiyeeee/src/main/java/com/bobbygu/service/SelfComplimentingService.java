package com.bobbygu.service;

import org.springframework.stereotype.Service;

@Service
public class SelfComplimentingService {

    public String randomCompliment() {
        return "You are the best at being random";
    }
}
