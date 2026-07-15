package org.example;

public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from Spring IoC!";
    }
}