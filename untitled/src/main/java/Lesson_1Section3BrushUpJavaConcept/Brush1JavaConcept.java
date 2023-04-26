package Lesson_1Section3BrushUpJavaConcept;
public class Brush1JavaConcept {

    public static void main(String[] args) {

        int myNum = 5;
        String webside = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;// or false

        System.out.println(myNum + "is the value stored in the myNum variable"); // żeby połączyć zmienną trzeba użyć operatora +
        System.out.println(webside);
        System.out.println(letter);
        System.out.println(myCard);

        //Arrays- can store multiple values in in one single variable
        int[] arr = new int[5]; // ta zmienna przechowa 5 wartości
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        // skrót tego co wyżej
        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122}; // indeksowanie zaczynamy od 0 czyli {0,1,2,3}
//        System.out.println (arr2[2]);

        // Pętla for loop    arr.length - 5
//        for (int i = 0; i<arr.length; i++) //za każdym razem iteracja osiągnie rozmiar tablicy i bedzie powiekszac o 1
//        {
//            System.out.println(arr[i]);
//        }
//
        for (int i =0; i<arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        String[] name = {"kazik", "sheety", "selenium"};
        for (int i =0; i<name.length;i++)
        {
            System.out.println(name[i]);
        }
        for( String s: name) // w każdej iteracji z name wybierz 1 wartość a ta wartość będzie przechowana w zmiennej s
        {
            System.out.println(s);
        }
    }
}
