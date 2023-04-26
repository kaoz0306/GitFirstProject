package JavaStart;

import java.util.Scanner;

public class Zadanie2 {
    /* Napisz program który odczytuje 2 zmienne i wypisuje do konsoli ich średnią arytmetyczną

     */
    public static void main(String[] args) {
        // zaimplentowac obiekt skanera
        Scanner myScanner = new Scanner(System .in);

        System.out.print("Wpisz liczbę A: ");// poinformować użytkowania żeby coś wpisał
        double a = myScanner.nextDouble(); //zapisuje w intiger a to co użytkownik wpiszę do konsoli za pomocą next.int
        System.out.print("Wpisz liczbę B: ");
        int b = myScanner.nextInt();

        System.out.println("Średnia: " + (double) ((a+b)/2));



    }
}

