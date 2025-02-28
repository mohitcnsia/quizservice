package com.apprec8.quizservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizApi {
    @GetMapping("/hello")
    public String helloQuizService() {
        return "This is a sample Quiz API";
    }
}
