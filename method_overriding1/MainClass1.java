package method_overriding1;
class ConcreteClass 
{
	static int add(int a, int b)
	{
	     return a + b; 
	}
	 
	int subtract(int a, int b) 
	{
	     return a - b;
	 }
}
abstract class AbstractClass1
{
	 abstract int multiply(int a, int b);
	 abstract double divide(double a, double b);
}
public class MainClass1
{
	 public static void main(String[] args) 
	 {
	     ConcreteClass concreteObj = new ConcreteClass();
	     int resultAdd = ConcreteClass.add(5, 3);
	     System.out.println("Static Addition: " + resultAdd);
	     int resultSubtract = concreteObj.subtract(10, 4);
	     System.out.println("Non-Static Subtraction: " + resultSubtract);
	     AbstractClass1 abstractObj = new AbstractClass1() 
	     {
	         int multiply(int a, int b) 
	         {
	             return a * b;
	         }
	         double divide(double a, double b) 
	         {
	             if (b != 0) 
	             {
	                 return a / b;
	             } else 
	             {
	                 System.out.println("Cannot divide by zero.");
	                 return Double.NaN;
	             }
	         }
	     };
	     int resultMultiply = abstractObj.multiply(4, 5);
	     System.out.println("Multiplication: " + resultMultiply);

	     double resultDivide = abstractObj.divide(10.0, 2.0);
	     System.out.println("Division: " + resultDivide);
	}
	 
}

