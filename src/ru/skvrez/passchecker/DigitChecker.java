package ru.skvrez.passchecker;

public class DigitChecker extends BaseChecker {

    private static final String ERROR_MESSAGE = "Not contains digit letters";

    @Override
    public void check(String text) {
        if (!text.matches(".*[0-9].*")) {
            this.errors.add(ERROR_MESSAGE);
        }
        super.check(text);
    }
}
