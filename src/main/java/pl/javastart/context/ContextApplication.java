package pl.javastart.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);

        MessageProducer messageProducer = new ConsoleMessageProducer();

        MessagePrinter firstMessagePrinter = new MessagePrinter(messageProducer);
        MessagePrinter secondMessagePrinter = new MessagePrinter(messageProducer);

        firstMessagePrinter.printMessage();
        secondMessagePrinter.printMessage();
    }

}
