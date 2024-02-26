package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_facebook_login // Assignment112
{
	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.facebook.com");
		c1.manage().window().maximize();
	
        c1.findElement(By.id("email")).sendKeys("vathsalyac35@gmail.com");
        c1.findElement(By.id("pass")).sendKeys("sunithamk");
        c1.findElement(By.name("login")).click();
        
	}

}
