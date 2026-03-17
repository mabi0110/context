package pl.javastart.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ContextApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContextApplication.class, args);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

        Arrays.stream(context.getBeanDefinitionNames())
                .map(context::getBean)
                .forEach(System.out::println);
    }

}
