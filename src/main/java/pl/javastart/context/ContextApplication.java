package pl.javastart.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);

        SimpleMessageProducer simpleMessageProducer  = new SimpleMessageProducer();

        MessagePrinter firstMessagePrinter = new MessagePrinter(simpleMessageProducer);
        MessagePrinter secondMessagePrinter = new MessagePrinter(simpleMessageProducer);

        firstMessagePrinter.printMessage();
        secondMessagePrinter.printMessage();
    }

}
