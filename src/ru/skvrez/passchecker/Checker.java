package ru.skvrez.passchecker;

import java.util.List;

public interface Checker {
    void setErrors(List<String> errorsList);
    void setNext(Checker checker);
    void check(String text);
}
