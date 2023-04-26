package Lesson_1Section3BrushUpJavaConcept;

import java.util.ArrayList;
import java.util.List;

public class Brush2LISTS {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
        // wyprintować wartości pomnożone przez 2 tzn 2,4,6,8,10,122
        // check if array has multiple of 2
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            } else {
                System.out.println(arr2[i] + "is not multiple of 2");
            }
        }
// dynamiczne zwiększanie tablicy. W naszym przypadku z 5 i więcej
        List<String> a = new ArrayList<String>();
        a.add("Kazik");  //zmienna add pomaga dodać wartości do metody ArrayList
        a.add("sheety");
        a.add("academy");
        a.add("selenium");
        System.out.println(a.get(3));
        //a.remove(2);
        // create object of the class- object.method
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("******************");
        for (String val : a) {
            System.out.println(val);
        }
        // item is present in ArrayList
        System.out.println(a.contains("selenium"));
        String[] name = {"Kazik", "shetty", "selenium"};
        //List<String> nameArrayList = Arrays.asList(name);
        //nameArrayList.contains("selenium");
    }
}
