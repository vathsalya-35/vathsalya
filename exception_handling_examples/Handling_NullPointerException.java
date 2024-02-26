package exception_handling_examples;
public class Handling_NullPointerException {

	public static void main(String[] args) 
	{
		try 
		{
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } 
		catch (NullPointerException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }

	}

}
