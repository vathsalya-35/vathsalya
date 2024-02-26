// area of a circle=pi*r*r--->viva exam
package practice_folder1;

import java.util.Scanner;

public class Areaofcircle 
{
	static double pi=3.14;
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the value of r");
		int radius = s1.nextInt();
        double area= pi*radius*radius;
        System.out.println("area of a circle is:");
        System.out.println(area);
	}
}
