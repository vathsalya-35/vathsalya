package a_s_1;
class Three
{
	void add() {
		System.out.println("addition");
	}
}
class Two extends Three
{
	void mult()
	{
		System.out.println("multiplication");
	}
}
class one extends Two
{
	void sub()
	{
		System.out.println("subtraction");	
	}
}
public class Assignment_45 extends one
{
	void division()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		Assignment_45 a1=new Assignment_45();
		a1.add();
		a1.division();
		a1.mult();
		a1.sub();
	}
}

