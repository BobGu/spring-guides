package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exception(Exception exception, Model model) {
        System.out.println("hhihiihihihihi");
        model.addAttribute("exception", exception);
        return "errorHandler";
    }

}
