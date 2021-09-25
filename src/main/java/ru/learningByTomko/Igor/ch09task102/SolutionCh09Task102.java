package ru.learningByTomko.Igor.ch09task102;

//9.102. Дано слово. Поменять местами его m-ю и n-ю буквы.

import java.util.Scanner;

public class SolutionCh09Task102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        System.out.println("Введите номер первой буквы");
        int m = scanner.nextInt();
        System.out.println("Введите номер второй буквы");
        int n = scanner.nextInt();
        System.out.println(replaceChar(word, n, m));

    }

    public static String replaceChar(String word, int n, int m) {
        char[] result = word.toCharArray();
        result[n] = word.charAt(m);
        result[m] = word.charAt(n);
        return String.valueOf(result);

    }

}
