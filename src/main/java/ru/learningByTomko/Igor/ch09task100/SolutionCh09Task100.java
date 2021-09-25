package ru.learningByTomko.Igor.ch09task100;

//9.100. Дано слово. Поменять местами его вторую и пятую буквы


import java.util.Scanner;

public class SolutionCh09Task100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        System.out.println(replaceChar(word));

    }

    public static String replaceChar(String word) {
        char[] result = word.toCharArray();
        result[1] = word.charAt(4);
        result[4] = word.charAt(1);
        return String.valueOf(result);

    }
}

