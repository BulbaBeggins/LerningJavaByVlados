package ru.learningByTomko.Igor.ch09task086;

//9.86. Дана последовательность слов. Проверить, правильно ли в ней записаны буквосочетания жи и ши.

import java.util.Scanner;

public class SolutionCh09Task086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова");
        String text = scanner.nextLine();
        System.out.println(check(text));

    }

    public static boolean check(String text) {
        return !text.contains("жы") && !text.contains("шы");
    }

}
