package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
}

public class App {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}