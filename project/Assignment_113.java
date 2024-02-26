//Launch Amazon Sign in page and login with Credentials.
package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113 {

	public static void main(String[] args) {
		ChromeDriver C1=new ChromeDriver();
		  C1.get("https://www.amazon.in/");
		  C1.manage().window().maximize();
		  C1.findElement(By.id("email")).sendKeys("vathsalyac35@gmail.com");
		  C1.findElement(By.name("continue")).click();

	}

}
