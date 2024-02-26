package assign_Inheritance1;
class Parent
{
	void add() 
	{
		System.out.println("adding the 3 numbers");
	}
}
public class Demo_Child extends Parent
{
	void add() 
	{
		super.add();
		System.out.println("adding the 2 numbers");
	}
	public static void main(String[] args) 
	{
		Demo_Child D1 = new Demo_Child();
		D1.add();
       
	}

}
