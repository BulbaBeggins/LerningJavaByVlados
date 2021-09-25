package ru.learningByTomko.Igor.ch09task015;

//9.15. Дано слово. Вывести на экран его k-й символ

import java.util.Scanner;

public class SolutionCh09Task015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String word = scanner.nextLine();
        System.out.println("Введите номер символа ");
        int index = scanner.nextInt();
        System.out.println(symbolTask(word, index));

    }

    public static char symbolTask(String word, int index) {
        if (Math.abs(index) < word.length()) {
            return word.charAt(Math.abs(index));
        } else {
            return ' ';
        }
    }

}
