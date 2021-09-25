package ru.learningByTomko.Igor.ch09task075;

//9.75. Дано предложение. Напечатать все его символы, предшествующие первой
//        запятой. Рассмотреть два случая:
//        1) известно, что в предложении запятые имеются;
//        2) в предложении запятых может не быть

import java.util.Scanner;

public class SolutionCh09Task075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение ");
        String proffer = scanner.nextLine();
        System.out.println(task1(proffer));
    }

    public static String task1(String proffer) {

        int commaIndex = proffer.indexOf(",");
        if (commaIndex>=0) {
            return proffer.substring(0,commaIndex);
        } else {
            return proffer;
        }
    }
}