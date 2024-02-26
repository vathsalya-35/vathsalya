package practice_folder1;
class Three
{
	void add() 
	{
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
public class multilevel_inheritence extends one
{
	void division()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		multilevel_inheritence a1=new multilevel_inheritence();
		a1.add();
		a1.division();
		a1.mult();
		a1.sub();
	}
}



