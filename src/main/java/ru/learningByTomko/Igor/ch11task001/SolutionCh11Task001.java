package ru.learningByTomko.Igor.ch11task001;

//11.1. Заполнить массив из восьми элементов следующими значениями: первый
//элемент массива равен 37, второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой — 13.

import java.util.Arrays;

public class SolutionCh11Task001 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));
    }

    public static int[] array (){
        int[] myArray;
        myArray = new int[8];
        myArray[0] = 37;
        myArray[1] = 0;
        myArray[2] = 50;
        myArray[3] = 46;
        myArray[4] = 34;
        myArray[5]  = 46;
        myArray[6] = 0;
        myArray[7] = 13;
        return myArray;
    }

}
