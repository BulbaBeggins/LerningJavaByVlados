package ru.learningByTomko.Igor.ch09task015;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task015Test {
    public static void main(String[] args) {
        symbolTask();
    }

    public static void symbolTask(){
        String expected = "а";
        char actual = SolutionCh09Task015.symbolTask("жаба",1);
        Assertion.assertEquals("SolutionCh09Task015.symbolTask", expected, actual);
    }

}