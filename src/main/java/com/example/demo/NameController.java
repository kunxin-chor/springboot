package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameController {
    @GetMapping("/name")
    public String hello(Map<String, Object> model) {
        model.put("name", "John Wick");
        return "hello";
    }
}
