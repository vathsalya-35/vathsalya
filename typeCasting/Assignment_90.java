package typeCasting; // case2: up casting & Down casting
class grandchild
{
	void testcase1()
	{
		System.out.println("print3");
	}
}
class parent extends grandchild
{
	void testcase2()
	{
		System.out.println("print2");
	}
}
public class Assignment_90 extends grandchild
{
	void testcase3()
	{
		System.out.println("print1");
	}
	public static void main(String[] args) 
	{   //Upcasting way
		grandchild t1=new Assignment_90();
		t1.testcase1();
		//Down casting way
		Assignment_90 A1=(Assignment_90)t1;
		A1.testcase1();
		A1.testcase3();
	}

}
