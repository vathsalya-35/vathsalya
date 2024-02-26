package practice_folder1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_handling_1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("enter the value of a");
			Scanner s1=new Scanner(System.in);
			boolean a1=s1.nextBoolean();		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("print that im a catch");
		}
		catch (NullPointerException a2)
		{
			System.out.println("print the nullpointer");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("print inputmismatch");
		}
		finally
		{
			System.out.println("im a finally keyword");
		}
	}
}
