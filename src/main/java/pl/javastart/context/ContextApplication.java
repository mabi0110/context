package pl.javastart.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class ContextApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContextApplication.class, args);
        MessageController messageController = context.getBean(MessageController.class);
        messageController.mainLoop();
    }

    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }

}
