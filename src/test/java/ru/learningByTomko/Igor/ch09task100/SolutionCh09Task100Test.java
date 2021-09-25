package ru.learningByTomko.Igor.ch09task100;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task100Test {


    public static void main(String[]args) {
        replaceChar();
    }


    public static void replaceChar() {
        String expected ="иьорг";
        String actual = SolutionCh09Task100.replaceChar("игорь");
        Assertion.assertEquals("SolutionCh09Tsk100",expected,actual);
    }
}