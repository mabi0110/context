package pl.javastart.context;

import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.Scanner;

@Controller
public class MessageController {

    private final MessagePrinter messagePrinter;
    private final Scanner scanner;

    public MessageController(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

    void mainLoop() {
        Option option;
        do {
            option = readOption();
            executeOption(option);
        } while (option != Option.EXIT);
    }

    private Option readOption() {
        int optionNumber;
        Optional<Option> option;
        do {
            printOptions();
            System.out.println("Wybierz numer: ");
            optionNumber = scanner.nextInt();
            scanner.nextLine();
            option = Option.fromInt(optionNumber);
        } while (option.isEmpty());
        return option.get();
    }

    private void printOptions() {
        System.out.println("Dostepne opcje: ");
        Option[] options = Option.values();
        for (Option option : options) {
            System.out.println(option);
        }
    }

    private void executeOption(Option option) {
        switch (option) {
            case Option.EXIT -> exit();
            case Option.NEXT_MESSAGE -> printMessage();
        }
    }

    private void exit() {
        System.out.println("Koniec programu");
    }

    private void printMessage() {
        messagePrinter.printMessage();
    }
}
