package pl.javastart.context;


import org.springframework.stereotype.Service;

@Service
public class MessagePrinter {

    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMessage() {
        System.out.println(messageProducer.getMessage());
    }
}
