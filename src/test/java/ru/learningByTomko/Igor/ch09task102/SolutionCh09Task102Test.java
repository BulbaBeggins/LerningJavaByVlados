package ru.learningByTomko.Igor.ch09task102;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task102Test {


    public static void main(String[]args) {
        replaceChar();
    }


    public static void replaceChar() {
        String expected = "авсобут";
        String actual = SolutionCh09Task102.replaceChar("автобус",2,6);
        Assertion.assertEquals("SolutionCh09Task102",expected,actual);
    }
}