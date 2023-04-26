package CapGemProjectBasics;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(add(4, 2));
        int result = add(a, b);
        System.out.println(result);
    }
    /* metoda add zwraca wynik typu int zeby jej uzyc trzeba podać w parametrach 2 inty */

    public static int add(int num1, int num2) {
        return num1 + num2;

    }
}
