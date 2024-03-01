//write a testNG code which has BS,BT,BC ,BM and one @test
package class_practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_137 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("test1");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("test2");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("test3");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("test4");
	}
	@Test
	public void test()
	{
		System.out.println("test5");
	}
}
