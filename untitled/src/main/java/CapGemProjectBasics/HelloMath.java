package CapGemProjectBasics;

public class HelloMath {
    public static void main(String[] args) {
        int i1 = 3, i2 = 5;

        int res1 = i1 + i2;
        // + - * / %-modulo
        int res2 = i2 + 1 * 7;

        // %-modulo - reszta z dzielenia
        int res3 = 10 % 3; // 1
        int res4 = 10 % 2; // 0


        // skróty
        i1+=7; // i1 = i1 + 7;
        i1/=3; // i1 = i1/3;

        // najczęściej spotyka się post/pre - inkrementacja ++/dekrementacja --
        int i3 = 0;
        i3++; // i3=i3+1; lukier syntaktyczny / 1
        ++i3; // i3=i3+1; // 2

        //użyj wartości i3 i POTEM zainkrementuj/powiększ i3 o jeden
        int i4 = i3++; // i4 = 2 , i3 = 3
        System.out.println("i4:" + i4);
        System.out.println("i3:" + i3);

        // NAJPIERW zinkrementuj i3 i dopiero wtedy użyj jego wartości
        i4 = ++i3; // i4=4, i3=4
        System.out.println("i4:" + i4);
        System.out.println("i3:" + i3);

        // Klasa Math
        int m1 = Math.abs(-5); // 5
        int m2 = (int) Math.pow(2,3); // 8D lub 8.0 po dodaniu int ->8 całkowita
        double m3 = Math.pow(2,3); // 8D lub 8.0
        double m4 = Math.sqrt(4); //2


    }

        }
