package ru.learningByTomko.Igor.ch09task086;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task086Test {


    public static void main(String[] args) {
        check();
    }


    public static void check() {
        boolean expected = true;
        boolean actual = SolutionCh09Task086.check("шина машины");
        Assertion.assertEquals("SolutionCh09Task086", expected, actual);
    }
}