package ru.learningByTomko.Igor.ch02task011;

import java.util.Scanner;

public class SolutionCh02Task011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reversNumber(scanner.nextInt()));
    }

    // 2.11 Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа
    public static int reversNumber(int number) {
        return (number % 10 * 10) + (number / 10);
    }
}
