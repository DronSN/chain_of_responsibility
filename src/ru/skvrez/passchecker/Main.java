package ru.skvrez.passchecker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String checkedText = "9644 ***SS????????";
        LetterChecker letterChecker = new LetterChecker();
        DigitChecker digitChecker = new DigitChecker();
        SymbolChecker symbolChecker = new SymbolChecker();
        letterChecker.setNext(digitChecker);
        digitChecker.setNext(symbolChecker);
        letterChecker.check(checkedText);
        System.out.println(symbolChecker.getErrors());
    }
}
