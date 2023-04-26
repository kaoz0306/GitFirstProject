package JavaStart;

import java.util.Scanner;

public class Zadanie3 {
    /* Napisz program, który odczytuje liczbę miejsc w samolocie oraz ilość rzędów. Progrma powinien
    wypisać ile wynosi wielkość danego rzędu. W przypadku, gdy nie jest możliwe uzyskanie takiej ilości
    wszystkich rzędów, ostatni rząd jest nieregularny.
    Do wywołania
    200 (ilość miejsc)
    10 (ilość rzędów)
    Warunkiem jest:
    20 (tyle osób można usadzić w jednym rzędzie)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę siedzeń: ");
        int seats = scanner.nextInt();

        System.out.println("Wpisz liczbę rzędów: ");
        int rows = scanner.nextInt();

        if(seats % rows == 0) {
            System.out.println("Rząd ma: " + seats/rows);
        }
        else {
            System.out.println("Rząd ma: " + seats/rows + " siedzen");
            System.out.println("A ostatni: " + seats % rows);
        }

    }
}
