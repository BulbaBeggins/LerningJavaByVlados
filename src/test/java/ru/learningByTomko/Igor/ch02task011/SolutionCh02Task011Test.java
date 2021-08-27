package ru.learningByTomko.Igor.ch02task011;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh02Task011Test {

    //Метод запуска теста
    public static void main(String[] args) {
        reversNumber();
    }

    //Метод теста
    public static void reversNumber() {
        int expected = 74;
        int actual = SolutionCh02Task011.reversNumber(47);
        Assertion.assertEquals("SolutionCh02Task011.reversNumber", expected, actual);
    }
}