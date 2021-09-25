package ru.learningByTomko.Igor.ch09task090;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task090Test {


    public static void main(String[]args) {
        replaceChar();
    }


    public static void replaceChar() {
        String expected = "ижинидильник";
        String actual = SolutionCh09Task090.replaceChar("еженедельник");
        Assertion.assertEquals("SolutionCh09Task090",expected,actual);

    }
}