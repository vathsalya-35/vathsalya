package exception_handling_examples;
public class Handling_Multiple_Exceptions 
{
	public static void main(String[] args) 
	{
        try 
        {
            int result = divideByZero(); // This method may throw ArithmeticException
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Null Pointer Error: " + e.getMessage());
        }
    }

    private static int divideByZero() 
    {
        return 5 / 0;
    }
}
