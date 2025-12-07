package com.example.productservice.contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/{name}")
    public String greetings(@PathVariable(required = false) String name) {
        return "Hello "+name;
    }
}
