package ru.skvrez.passchecker;

import java.util.List;

public class LetterChecker extends BaseChecker{

    private static final String ERROR_MESSAGE = "Not contains latin letters";

    @Override
    public void check(String text) {
        if (!text.matches(".*[a-zA-Z].*")) {
            this.errors.add(ERROR_MESSAGE);
        }
        super.check(text);
    }
}
