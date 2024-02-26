package assign_SwitchCase;
import java.util.Scanner;
public class Assignment_42 
{
	public static void main(String[] args, int a) 
	{
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the value of b,c");		
		int b=S1.nextInt();
		int c=S1.nextInt();
		int Addition= b+c;
		int Subtraction= b-c;
		int Multiplication= b*c;
		int Division= b/c;
		System.out.println("Enter the value of a");
			switch(a) 
			{ 
		       case 1: 	   
		    	   System.out.println(Addition);
		    	   break;
		       case 2:
		    	   System.out.println(Subtraction);
		    	   break;
		       case 3: 
		    	   System.out.println(Multiplication);
		       break;
		       case 4: 
		    	   System.out.println(Division);
		       break;
		       default : System.out.println("Iam the default line");	    	   
		    }
	}		
}
