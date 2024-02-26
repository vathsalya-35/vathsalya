package practice_project1;
public class MyClass {                                                                     // Static method with int parameter
	        public static void myMethod(int a) {
		        System.out.println("Static method with int parameter: " + a);
		    }
		                                                                                   // Static method with double parameter
		    public static void myMethod(double a) {
		        System.out.println("Static method with double parameter: " + a);
		    }
		                                                                                  // Static method with char parameter
		    public static void myMethod(char a) {
		        System.out.println("Static method with char parameter: " + a);
		    }
		                                                                                  // Non-static method with boolean parameter
		    public void myMethod(boolean a) {
		        System.out.println("Non-static method with boolean parameter: " + a);
		    }
		                                                                                 // Non-static method with String parameter
		    public void myMethod(String a) {
		        System.out.println("Non-static method with String parameter: " + a);
		    }
		    public static void main(String[] args) {
		                                                                                 // Creating an instance of the class
		        MyClass myClass = new MyClass();
		                                                                                 // Calling static methods with different parameter types
		        myClass.myMethod(5);
		        myClass.myMethod(3.14);
		        myClass.myMethod('A');
		                                                                               // Calling non-static methods with different parameter types
		        myClass.myMethod(true);
		        myClass.myMethod("Hello");
		    }
		

	}


