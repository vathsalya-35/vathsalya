package testng;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Accessing elements in the Vector
        System.out.println("Elements in the Vector:");
        for (String language : vector) {
            System.out.println(language);
        }

        // Removing an element
        vector.remove("Python");

        // Size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Check if the Vector contains an element
        System.out.println("Does the Vector contain 'Java'? " + vector.contains("Java"));
    }
}

