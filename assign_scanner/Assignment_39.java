//
package assign_scanner;
import java.util.Scanner;
public class Assignment_39 
{
	public static void main(String[] args) 
	{
     Scanner S1= new Scanner(System.in);
     System.out.println("Enter the value of age:	");		
     int age=S1.nextInt();
     if (age>=18) 
     {
    	 System.out.println("Iam adult");
     }
     else 
     {
    	 System.out.println("Iam still young");
     }

	}

}
