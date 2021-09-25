package ru.learningByTomko.Igor.ch09task076;


import ru.learningByTomko.Igor.Assertion;

public class SolutionCh09Task076Test {


    public static void main(String[] args) {
        findChar();
        findCharLast();
    }


    public static void findChar() {
        int expected = 2 ;
        int actual = SolutionCh09Task076.findChar("Оберег бобра");
        Assertion.assertEquals("SolutionCh09Test076",expected,actual);
    }


    public static void findCharLast() {
        int expected = 4 ;
        int actual = SolutionCh09Task076.findCharLast("Оберег бобра");
        Assertion.assertEquals("SolutionCh09Test076",expected,actual);
    }
}