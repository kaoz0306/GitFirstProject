package JavaStart;

import java.util.Random;

public class Zadanie4 {
    /* Napisz program który losuje liczbę losową z przedziału 1...100. Użyj Random */

    public static void main(String[] args) {
        Random random = new Random();
        int start = 1;
        int stop = 100;
        int rand = random.nextInt(stop - start) + start; // możemy ograniczyć górną pozycję losowania

    }
}
