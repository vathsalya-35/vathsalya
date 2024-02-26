package assign_scanner;
import java.util.Scanner;
public class Assignment_36 
{
	public static void main(String[] args) 
	{
		Scanner S1= new Scanner(System.in);
		System.out.println("enter the value for a");
        int a= S1.nextInt();
        System.out.println("enter the value for b");
        int b=S1.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;
        System.out.println("Sum of 2 numbers is: ");
        System.out.println(sum); 
        System.out.println("Subtraction of 2 numbers is: ");
        System.out.println(sub); 
        System.out.println("multiplication of 2 numbers: ");
        System.out.println(mult); 
        System.out.println("division of 2 numbers: ");
        System.out.println(div); 
	}
}
