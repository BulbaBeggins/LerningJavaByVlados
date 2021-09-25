package ru.learningByTomko.Igor.ch09task059;
//9.59. Дано предложение. Определить число букв о в нем

import java.util.Scanner;

public class SolutionCh09Task059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String proffer = scanner.nextLine();
        System.out.println(sumChar(proffer));
    }

    public static int sumChar(String proffer) {
        int sum = 0;
        String s = proffer.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о'||s.charAt(i) == 'o') {
                sum++;
            }
        }
        return sum;
    }
}
