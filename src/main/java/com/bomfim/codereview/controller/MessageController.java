package com.bomfim.codereview.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bomfim.codereview.service.MessageService;

@RestController
@RequestMapping("/api/v1/Message")
public class MessageController {

    @GetMapping
    public String showMessage(@RequestParam String message) {
        return message;
    }

    @GetMapping("/percentage")
    public String messageResult(@RequestParam Double percentage) {
        return new MessageService().getPercentageRounds(percentage);
    }
}
