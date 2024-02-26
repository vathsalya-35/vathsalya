//Assignment-129-Handle javascript popup of growtechminds application and get the title of the pageS
package popup_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vaths/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.id("1"));
		firstname.sendKeys("Manish");
		//Thread.sleep(2000);
	}

}
