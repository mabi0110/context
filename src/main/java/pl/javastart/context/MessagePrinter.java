package pl.javastart.context;

public class MessagePrinter {

    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    void printMessage() {
        System.out.println(messageProducer.getMessage());
    }
}
