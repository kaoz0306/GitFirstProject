package Lesson_1Section3BrushUpJavaConcept;

public class Brush3STRING {
    public static void main(String[] args) {
        // string is an object that represent sequence of characters
        // we can define in two ways 1 literal:

        //String s1 = "Kazimierz learn automation";
        String s5 = "hello";

        // or we can define as new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");
        // in both cases the value will be saved in s variable

        String s = "Kazimierz learn automation";
        // we can define all strings in one array
        String[] splitedString = s.split("learn");
        System.out.println(splitedString[0]);
        System.out.println(splitedString[1]);
        // to print word automation with space
        System.out.println(splitedString[1].trim());
        // to print the characters one by one
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }

        //if we want to start loop from the reverse site
//        for(int i=s.length()-1;i>0;i--)
//        {
//            System.out.println(s.charAt(i));
//        }
    }

}
