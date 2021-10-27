package ru.learningByTomko.Igor.ch11task014;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh11Task014Test {


    public static void main(String[] args) {
        reverse();
    }


    public static void reverse() {
        int [] expected = {5, 4, 3, 2, 1};
        int [] actual = SolutionCh11Task014.reverse(new int[]{1, 2, 3, 4, 5,});
        Assertion.assertEquals("SolutionCh11Task014.reverse", expected, actual);
    }
}