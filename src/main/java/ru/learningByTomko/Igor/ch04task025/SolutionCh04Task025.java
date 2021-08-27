package ru.learningByTomko.Igor.ch04task025;

public class SolutionCh04Task025 {
//    4.25. Дано двузначное число. Определить:
//    а) является ли сумма его цифр двузначным числом;
//    б) больше ли числа а сумма его цифр


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
    }

    public static boolean Comparison() {
        int a = 47;
        if (a / 10 + a % 10 < 10) {
            return false;
        }

        if (a / 10 + a % 10 > a) {
            return true;
        }
        return false;
    }

}
