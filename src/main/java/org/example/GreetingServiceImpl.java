package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final MessageService messageService;

    @Autowired
    public GreetingServiceImpl(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String greet(String name) {
        return messageService.getMessage() + " Welcome, " + name + "!";
    }
}