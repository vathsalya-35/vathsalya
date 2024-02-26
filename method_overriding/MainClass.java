package method_overriding;
//Concrete class with static and non-static methods
class concreteClass {
 // Static method
 static int add(int a, int b) {
     return a + b;
 }

 // Non-static method
 int subtract(int a, int b) {
     return a - b;
 }
}
//Abstract class with two abstract methods
abstract class AbstractClass {
 abstract int multiply(int a, int b);

 abstract double divide(double a, double b);
}
//Main class with concrete methods
public class MainClass {
 public static void main(String[] args) {
     // Creating an instance of the concrete class
     concreteClass concreteObj = new concreteClass();

     // Using static method from ConcreteClass
     int resultAdd = concreteClass.add(5, 3);
     System.out.println("Static Addition: " + resultAdd);

     // Using non-static method from ConcreteClass
     int resultSubtract = concreteObj.subtract(10, 4);
     System.out.println("Non-Static Subtraction: " + resultSubtract);

     // Creating an instance of the abstract class
     AbstractClass abstractObj = new AbstractClass() {
         // Implementing abstract methods
         @Override
         int multiply(int a, int b) {
             return a * b;
         }

         @Override
         double divide(double a, double b) {
             if (b != 0) {
                 return a / b;
             } else {
                 System.out.println("Cannot divide by zero.");
                 return Double.NaN;
             }
         }
     };

     // Using abstract methods from AbstractClass
     int resultMultiply = abstractObj.multiply(4, 5);
     System.out.println("Multiplication: " + resultMultiply);

     double resultDivide = abstractObj.divide(10.0, 2.0);
     System.out.println("Division: " + resultDivide);
 }
}