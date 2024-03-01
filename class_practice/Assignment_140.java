//write a testNG code which has three @test and a single BM 
package class_practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_140 
{
	@BeforeMethod
	public void method1() 
	{
		System.out.println("Before method");
	}
	@Test
	public void test1()
	{
		System.out.println("test of test case1");
	}
	@Test
	public void test2() 
	{
		System.out.println("test of testcase2");
	}
	@Test
	public void test3() 
	{
		System.out.println("test of testcase3");
	}
}
