package ru.learningByTomko.Igor.ch09task059;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task059Test {


    public static void main(String[] args) {
        sumChar();

    }

    public static void sumChar() {
        int expended = 4;
        int actual = SolutionCh09Task059.sumChar("абоба ломает обои");
        Assertion.assertEquals("SolutionCh09Task059", expended, actual);

    }
}