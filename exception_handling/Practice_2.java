package exception_handling;
import java.util.Scanner;
public class Practice_2 
{
	public static void main(String[] args) 
    {
        try 
        {
            Scanner S1 = new Scanner(System.in);
            System.out.print("Enter a boolean value: ");
            boolean salary = S1.nextBoolean();
        }
        catch (java.util.InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter a valid boolean value.");
        }
        catch (ArithmeticException a1)
        {
            System.out.println("int cannot store infinity");
        }
        finally
        {
            System.out.println("finally keyword");
        }
    }
}