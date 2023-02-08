package com.bomfim.codereview.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Message")
public class MessageController {

    @GetMapping
    public String showMessage(@RequestParam String message) {
        return message;
    }
}
