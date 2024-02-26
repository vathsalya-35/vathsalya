//findout the area of a circle for ten times,take pi value from math.pi and take r value from math.random and solve this problem 10 times.
package object_Math;
public class Assignment_94 
{
	public static void main(String[] args) 
	{    
		for (int i=0; i<=9;i++)
	{
		double radius= Math.random();
		double area= ( Math.PI*radius*radius);
		System.out.println(area);
	}
	}
}
