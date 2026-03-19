package pl.javastart.context;

import java.util.Optional;

public enum Option {

    EXIT(0, "wyjscie z programu"), NEXT_MESSAGE(1, "nastepna wiadomosc");

    private final int option;
    private final String description;

    Option(int option, String description) {
        this.option = option;
        this.description = description;
    }

    static Optional<Option> fromInt(int number) {
        Option[] options = Option.values();
        if (number >= 0 && number < options.length) {
            return Optional.of(options[number]);
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return option + " - " + description;
    }
}
