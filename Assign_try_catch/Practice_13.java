package Assign_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Practice_13 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			boolean myanswerfordinner=s1.nextBoolean();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("1");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("2");
		}
		catch(NullPointerException a2)
		{
		     System.out.println("3");
		}
		finally
		{
			System.out.println("4");
		}
	}
}
