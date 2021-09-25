package ru.learningByTomko.Igor.ch09task090;

import java.util.Scanner;

//9.90. Дано предложение. Все буквы е в нем заменить буквой и

public class SolutionCh09Task090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String word = scanner.nextLine();
        System.out.println(replaceChar(word));

    }

    public static String replaceChar(String word) {
        return word.replace('е', 'и');
    }
}
