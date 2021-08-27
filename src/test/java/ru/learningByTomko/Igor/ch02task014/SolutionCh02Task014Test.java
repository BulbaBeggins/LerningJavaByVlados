package ru.learningByTomko.Igor.ch02task014;

import ru.learningByTomko.Igor.Assertion;
import ru.learningByTomko.Igor.ch02task014.SolutionCh02Task014;

public class SolutionCh02Task014Test {


    //Метод запуска теста
    public static void main(String[] args) {
        reversNumber();
    }

    //Метод теста
    public static void reversNumber() {
        int expected = 587;
        int actual = SolutionCh02Task014.reversNumber(758);
        Assertion.assertEquals("SolutionCh02Task014.reversNumber", expected, actual);
    }
}