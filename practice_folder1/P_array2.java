package practice_folder1;
import java.util.Scanner;
public class P_array2 
{
	public static void main(String[] args) 
	{
		int number[]=new int[5];
		
		for(int i=0; i<=4;i++)
		{
		  Scanner s1=new Scanner(System.in);
		  System.out.println("enter the values for i");
		  number[i]=s1.nextInt();		  
		}
		
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
	}
}
