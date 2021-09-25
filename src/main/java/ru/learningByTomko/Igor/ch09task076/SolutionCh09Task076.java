package ru.learningByTomko.Igor.ch09task076;

//9.76. Дано предложение, в котором имеется несколько букв е. Найти:
//а) порядковый номер первой из них;
//б) порядковый номер последней из них

import java.util.Scanner;

public class SolutionCh09Task076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String proffer = scanner.nextLine();
        System.out.println(findChar(proffer));
        System.out.println(findCharLast(proffer));

    }

    public static int findChar(String proffer) {
        return proffer.indexOf('е');
    }

    public static int findCharLast(String proffer) {
        return proffer.lastIndexOf('е');
    }
}
