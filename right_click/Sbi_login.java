//Launch online sbi link,click on login button, and inspect username,password and captchaS
package right_click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sbi_login 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login= driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])"));
		login.click();
		WebElement users_name= driver.findElement(By.id("username"));
		users_name.sendKeys("vathsalya");
		driver.findElement(By.id("label2")).sendKeys("pass123");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("c8e23");
		driver.findElement(By.id("Button2")).click();		
	}
}
