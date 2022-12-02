package com.example.springboot3nativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot3nativedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3nativedemoApplication.class, args);
    }

    @GetMapping("/{name}")
    String helloWorld(@PathVariable String name) {
        return "Hello <span style='color: red'>%s</span>, welcome to <i>native</i> world!".formatted(name);
    }
}
