package ru.learningByTomko.Igor.ch02task014;

import java.util.Scanner;

public class SolutionCh02Task014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reversNumber(scanner.nextInt()));
    }
    // 2.14. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее в конце. Найти полученное число.

    public static int reversNumber(int number) {
        return (number / 10 % 10 * 100) + (number % 10 * 10) + (number / 100);
    }
}
