package Lesson_1Section3BrushUpJavaConcept;

public class MethodDemo {
    public static void main(String[] args) {
        // If I want access any method of the class I have to create an object of that class
        // This is object
        MethodDemo d = new MethodDemo();
        // This is method
        String name = d.getData();
        System.out.println(name);
        // to method 2
        MethodDemo2 d1 = new MethodDemo2();
        d1.getUserData();
    }

    // we are declaring the method in class but not run the method because we are out of {} from up
    public String getData() {
        System.out.println("Hello world");
        return "Kazik automaty";
    }
}
