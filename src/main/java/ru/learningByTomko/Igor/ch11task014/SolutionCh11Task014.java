package ru.learningByTomko.Igor.ch11task014;

//11.14. Вывести элементы массива на экран в обратном порядке.


import ru.learningByTomko.Igor.common.Common;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionCh11Task014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        int[] arr = new int[5];
        Common.fillArray(arr, scanner);
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        int[] reversArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversArr[arr.length-i-1]=arr[i];
        }
        return reversArr;
    }
}
