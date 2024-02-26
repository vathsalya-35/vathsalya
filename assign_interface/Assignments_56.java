//"Create child class having relation with interface(1st) 1st interface having relation with 2nd interface 2nd interface having relation with 3rd interface"
package assign_interface;
interface test3 //Assignment56
{
	void testmethod3();
}
interface test2 extends test3
{
	void testmethod2();
}
interface test1 extends test2
{
	void testmethod1();
}
public class Assignments_56 implements test1
{
	public static void main(String[] args) 
	{
		Assignments_56 A2=new Assignments_56();
		A2.testmethod1();
		A2.testmethod2();
		A2.testmethod3();
	}
	public void testmethod2() 
	{
	 System.out.println("print 2");
	}
	public void testmethod3() {
	  System.out.println("print3");
	}
	public void testmethod1() 
	{
		System.out.println("print1");
	}

}
