package com.example.httpissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/http/issue")
@SpringBootApplication
public class HttpIssueApplication {


    @GetMapping
    public String get() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(HttpIssueApplication.class, args);
    }

}
