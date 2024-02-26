//Launch Flipkart hover over fashion and click on men's T-shirt-Assignment-131
package hoverover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverover_Assignment_131 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement fashion= driver.findElement(By.xpath("((//span[.='Fashion'])[2])"));
		Thread.sleep(3000);
		Actions a1= new Actions (driver);
		a1.moveToElement(fashion).perform();
		WebElement Shirt=driver.findElement(By.linkText("Men's T-Shirts"));
		Shirt.click();
	}

}
