package practice_folder1;
public class FinallyExample 
{

	public static void main(String[] args) 
	{
		 try 
		    {
	            // Some code that may throw an exception
	            int result = 10 / 0;
	        } 
		 catch (ArithmeticException e) 
		    {
	            System.out.println("Cannot divide by zero!");
	        } 
		 finally 
		    {
	            System.out.println("This code will always be executed, regardless of whether an exception occurred or not.");
	        }

	}

}
