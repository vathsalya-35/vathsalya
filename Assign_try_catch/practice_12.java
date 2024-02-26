package Assign_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class practice_12 
{
  public static void main(String[] orgs)
  {
	  try
	  {
		 // int c=1/1;
		  Scanner S1=new Scanner(System.in);
		  boolean myasnswerfordinner=S1.nextBoolean();
	  }
	  catch (ArithmeticException a1)
	  {
		  System.out.println("int cannot store infinity, so please do not worry");
	  }
	  catch(NullPointerException a2)
	  {
		  System.out.println("do not worry i have handled it");
	  }
	  catch(InputMismatchException a3) 
	  {
		  System.out.println("i have handled it");
	  }
  }
}
