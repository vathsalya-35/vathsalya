//write a testNG code which has BM,AM,two  @test
package class_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_139 
{
	@BeforeMethod
	public void method1() 
	{
		System.out.println("Before method");
	}
	@Test
	public void test()
	{
		System.out.println("test of test method");
	}
	@Test
	public void abc() 
	{
		System.out.println("test of abc method");
	}
	@AfterMethod
	public void method2()
	{
		System.out.println("After method");
	}
}
