package ru.skvrez.passchecker;

public class SymbolChecker extends BaseChecker {

    private static final String ERROR_MESSAGE = "Not contains characters *@$%";

    @Override
    public void check(String text) {
        if (!text.matches(".*[*@$%].*")) {
            this.errors.add(ERROR_MESSAGE);
        }
        super.check(text);
    }
}
