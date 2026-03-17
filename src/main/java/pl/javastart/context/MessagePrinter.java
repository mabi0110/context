package pl.javastart.context;

public class MessagePrinter {

    private final SimpleMessageProducer simpleMessageProducer;


    public MessagePrinter(SimpleMessageProducer simpleMessageProducer) {
        this.simpleMessageProducer = simpleMessageProducer;
    }

    void printMessage() {
        System.out.println(simpleMessageProducer.getMessage());
    }
}
