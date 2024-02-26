//write a program for hierarchical inheritance and create three separate classes(son, daughter, parent) 
package assign_Inheritance;
public class Assign_47_son extends Assign_47_parent 
{
	public static void method3()
	{
		System.out.println("this is the son class");
	}
	public static void main(String[] args) 
	{
	    method3();
		method1();
		Assign_47_daugter A1=new Assign_47_daugter();
		A1.method2();
	}
}

