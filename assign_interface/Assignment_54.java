//Create child class having relation with Abstract class and that abstract class is having relation with 2 different interfacesv
package assign_interface;
interface method1 //Assignment 54
{
	void add();
}
interface method2
{
	void subtract();
}
abstract class method3 implements method1, method2
{
	abstract void division();
}
public class Assignment_54 extends method3
{
	public static void main(String[] args)
	{
		Assignment_54 A1=new Assignment_54();
		A1.add();
		A1.subtract();
		A1.division();
	}
	public void add() {
		System.out.println("print add");
	}
	public void subtract() 
	{
        System.out.println("print subtract");
	}

	void division() 
	{
	    System.out.println("print division");
	}

}
