//Login to Facebook using id,name locator
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_112 
{
	public static void main(String[] args) {
	  ChromeDriver C1=new ChromeDriver();
	  C1.get("http://www.facebook.com");
	  C1.manage().window().maximize();
	  C1.findElement(By.id("email")).sendKeys("vathsalyac35@gmail.com");
	  C1.findElement(By.id("pass")).sendKeys("sunithamk@66");
	  C1.findElement(By.name("login")).click();
	}

}
