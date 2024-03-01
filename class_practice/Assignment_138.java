//write a testnNG code which has BS,AS,BM,BC,AC and one @test
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

public class Assignment_138 {
	@BeforeSuite
	public void BS()
	{
		System.out.println("test1");
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
	@AfterClass
	public void AC()
	{
		System.out.println("test6");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("test7");
	}
}
