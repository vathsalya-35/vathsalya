package exception_handling_examples;

public class Handling_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		 try 
		 {
	            int[] array = {1, 2, 3};
	            System.out.println(array[5]); // This will throw ArrayIndexOutOfBoundsException
	     } 
		 
		 catch (ArrayIndexOutOfBoundsException e)
		 {
	            System.out.println("Error: " + e.getMessage());
	     }
	}

}
