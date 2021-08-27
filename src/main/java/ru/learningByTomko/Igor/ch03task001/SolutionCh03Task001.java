package ru.learningByTomko.Igor.ch03task001;

public class SolutionCh03Task001 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(comparisonA(a,b));
        System.out.println(comparisonB(a,b));
        System.out.println(comparisonC(b,c));

    }

    // //3.1. Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:
    ////а) А или В; б) А и В; в) В или С.
    public static boolean comparisonA(boolean a, boolean b) {
        return a || b;
    }

    public static boolean comparisonB(boolean a, boolean b) {
        return a && b;
    }

    public static boolean comparisonC(boolean b, boolean c) {
        return b || c;
    }
}


