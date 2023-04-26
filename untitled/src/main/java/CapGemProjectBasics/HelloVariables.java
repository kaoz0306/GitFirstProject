package CapGemProjectBasics;

public class HelloVariables {
    public static void main(String[] args) {
        // deklaracja w metodzie
        int i1;
      /*  System.out.println(i1+3);nie działa bo i1 nie jest zainicjalizowane*/
        // inicjalizacja/zmiana wartości
        i1 = 3;

        // deklaracja i inicjalizacja
        int i2 = 5;

        //zmiana wartości
        i2 = 7;

        // wielokrotna deklaracja
        int i3,i4,i5;

        //wielokrotna deklaracja z inicjalizacją
        int i6 = 6,i7 = 8;

        /* nie ma wielokrotnej zmiany wartości
        i6=10,i7=2; */

        // przypisywanie wartośći zmiana wartości
        i3 = 5; // 5
        i3 = i6; // 6
        i3 = 1; //
        System.out.println(i6); //6

    }
}
