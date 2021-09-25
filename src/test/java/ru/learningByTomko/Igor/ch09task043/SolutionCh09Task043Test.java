package ru.learningByTomko.Igor.ch09task043;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task043Test {


    public static void main(String[] args) {
        wordS();
    }

    public static void wordS() {
        String expected = "аоа";
        String actual = SolutionCh09Task043.wordS("абоба");
        Assertion.assertEquals("SolutionCh09Task043", expected, actual);
    }
}