//Hoverover the account&lists in the amazon.in page
package hoverover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_introduction 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1= new Actions(driver);
        a1.moveToElement(e1).perform();
	}

}
