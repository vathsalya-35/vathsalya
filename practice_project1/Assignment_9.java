package practice_project1;
public class Assignment_9 
{
	public static void main(String[] args) {
		System.out.println("Here are arithmatic operations as static method calling from main method");
		add();
		subtraction();
		multiplication();
		division();
	}public static void division() 
	{
		int g=7;
		int h=3;
		int i=g/h;
		System.out.println(i);
	}public static void add() 
	{
		int a=7;
	    int b=3;
	    int c=a+b;
	   System.out.println(c);
	}private static void subtraction() 
	{
		int d=5;
		int e=6;
		int f=e-d;
		System.out.println(f);
		
	}
	private static void multiplication() {
		int a1=2;
		int b1=3;
		int c1=a1*b1;
		System.out.println(c1);
	}
	
}