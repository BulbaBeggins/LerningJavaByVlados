package ru.learningByTomko.Igor.ch09task043;

import java.util.Scanner;

public class SolutionCh09Task043 {
    //    9.43. Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String word = scanner.nextLine();
        System.out.println(wordS(word));

    }

    public static String wordS(String word) {
        String result = "";
        for (int i = 1; i <= word.length(); i++) {
            if (i % 2 != 0) {
                result += word.charAt(i - 1);
            }

        }
        return result;

    }
}
