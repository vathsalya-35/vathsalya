package assign_SwitchCase;
import java.util.Scanner;
public class Assignment_41 
{
	public static void main(String[] args) 
	{
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= S1.nextInt();
		switch(a) 
	    {  
	       case 1: System.out.println("Addition");
	       case 2: System.out.println("Subtraction");
	       case 3: System.out.println("Multiplication");
	       break;
	       case 4: System.out.println("Division");
	       default : System.out.println("Iam the default line");	    	   
	    }
		
	}

}
