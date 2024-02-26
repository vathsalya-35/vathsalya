package exception_handling;

import java.util.Scanner;

public class Assignment_61 
{

	public static void main(String[] args) 
	{
		try (Scanner S1 = new Scanner(System.in)) 
		{
			try 
			{
				 int c = 1 / 0;
			}
			catch (ArithmeticException a1)
			{
				System.out.println("Do not worry I have handled it");
			}
			try 
			{
				System.out.print("Enter an integer: ");
			    int a = S1.nextInt();
			} 
			catch (java.util.InputMismatchException e) 
			{
			System.out.println("InputMismatchException caught: " + e.getMessage());
			}
			finally
			{
				System.out.println("1");
			}
		}
	}

}
