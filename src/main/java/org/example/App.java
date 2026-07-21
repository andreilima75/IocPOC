package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
class AppConfig {
    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
}

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("=== Spring IoC + DI Demo ===\n");

        MessageService messageService = context.getBean(MessageService.class);
        System.out.println("MessageService: " + messageService.getMessage());

        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println("GreetingService: " + greetingService.greet("Alice"));

        MessageService service1 = context.getBean(MessageService.class);
        MessageService service2 = context.getBean(MessageService.class);
        System.out.println("Same instance? " + (service1 == service2) + " (Default: Singleton)");
    }
}