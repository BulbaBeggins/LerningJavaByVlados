package ru.learningByTomko.Igor.ch11task002;

import ru.learningByTomko.Igor.common.Common;


import java.util.Arrays;
import java.util.Scanner;
//
////11.2. Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры
////в ходе выполнения программы.

public class SolutionCh11Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int[] arr = new int[10];
        Common.fillArray(arr, scanner);
        System.out.println(Arrays.toString(arr));
    }
}

