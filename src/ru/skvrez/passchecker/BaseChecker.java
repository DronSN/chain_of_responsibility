package ru.skvrez.passchecker;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseChecker implements Checker {

    private Checker next;
    protected List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    @Override
    public void setNext(Checker checker) {
        this.next = checker;
    }

    @Override
    public void check(String text) {
        if (next != null) {
            next.setErrors(this.errors);
            next.check(text);
        }
    };
}
