package com.example.hashbrown;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashbrownController {

    @GetMapping("/test")
    String test(){
        return "hello!";
    }
}
