package class_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_class 
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
	@AfterMethod
	public void AM()
	{
		System.out.println("test7");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("test8");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("test9");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("test10");
	}
}

