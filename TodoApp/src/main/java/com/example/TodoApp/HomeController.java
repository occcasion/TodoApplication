package com.example.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }

    @GetMapping("/dev")
    public String helloDev() {
        return "To-do Application dev !";
    }
}
