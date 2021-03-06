package ru.learningByTomko.Igor;

import java.util.Arrays;

public class Assertion {

    public static void assertEquals(String testName, int expected, int actual){
        if (expected==actual){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ expected + ", actual " + actual);
        }
    }
    public static void assertEquals(String testName, double expected, double actual){
        if (expected==actual){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ expected + ", actual " + actual);
        }
    }
    public static void assertEquals(String testName, String expected, String actual){
        if (expected.equals(actual)){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ expected + ", actual " + actual);
        }
    }
    public static void assertEquals(String testName, Object[] expected, Object[] actual){
        if (Arrays.equals(expected,actual)){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ Arrays.toString(expected) + ", actual " + Arrays.toString(actual));
        }

    }
    public static void assertEquals(String testName, String expected, char actual){
        if (expected.equals(String.valueOf(actual))){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ expected + ", actual " + actual);
        }
    }
    public static void assertEquals(String testName, boolean expected, boolean actual){
        if (expected==actual){
            System.out.println(testName + " passed");
        } else{
            System.out.println(testName + " failed: expected "+ expected + ", actual " + actual);
        }
    }

}
