package exception_handling_examples;
public class Handling_ArithmeticException 
{
	public static void main(String[] args) 
	{
		 try 
		    { 
	            int result = 5 / 0; // This will throw ArithmeticException
	            System.out.println("Result: " + result);
	        } 
		 
		 catch (ArithmeticException e) 
		    {
	            System.out.println("Error: " + e.getMessage());
	        }
	}
}
