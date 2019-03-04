package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {

    @GetMapping("/abacate")
    public String get() {
        return UUID.randomUUID().toString();
    }
}
