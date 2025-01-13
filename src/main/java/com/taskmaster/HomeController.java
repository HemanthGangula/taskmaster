package com.taskmaster.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<body>" +
               "<h1 style='text-align:center;'>Welcome to Taskmaster!</h1>" +
               "<p style='text-align:center;'> Spring Boot Demonstration  </p>" +
               "</body>" +
               "</html>";
    }
}