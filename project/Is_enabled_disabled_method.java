//is_enabled/disabled-methods-Assignment-125
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Is_enabled_disabled_method {
	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/vaths/Downloads/learningHTML1.html");
	  driver.manage().window().maximize();
	  WebElement L_name=driver.findElement(By.id("121"));
	  boolean checking_L_name=L_name.isEnabled();
	  if (checking_L_name==true && L_name.isDisplayed()==true)
	  {
		  L_name.sendKeys("123");
	  }
	  else 
	  {
		  System.out.println("either component is not displaying or it is disabled");
	  }
	}
}
