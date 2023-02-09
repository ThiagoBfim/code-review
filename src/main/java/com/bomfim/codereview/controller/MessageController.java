package com.bomfim.codereview.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bomfim.codereview.service.FormatType;
import com.bomfim.codereview.service.MessageService;

@RestController
@RequestMapping("/api/v1/Message")
public class MessageController {

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public String showMessage(@RequestParam String message) {
        return message;
    }

    @GetMapping("/percentage")
    @Secured("ROLE_ADMIN") /*Let's assume we have this role in our project*/
    public String messageResult(@RequestParam Double percentage) {
        return new MessageService().getPercentageRounds(percentage);
    }

    @PostMapping
    public String saveNewMessage(@RequestParam String message) {
        final File file = new File("message.txt");
        try {
            Files.writeString(file.toPath(), message);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return message;
    }

    @GetMapping("/format")
    public String formatMessage(@RequestParam String message, @RequestParam FormatType formatType) {
        return new MessageService().formatMessage(message, formatType);
    }

}
