package com.sukriti.AuthVault.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + " from AuthVault";
    }
}