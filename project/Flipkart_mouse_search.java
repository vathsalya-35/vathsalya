//
package project;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart_mouse_search 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.in");
		driver.manage().window().maximize();
        WebElement a1 =driver.findElement(By.name("q"));
        a1.sendKeys("mouse");
        a1.sendKeys(Keys.ENTER);
        List<WebElement> t2= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/div/div"));
        t2.get(t2.size()-6).click();
	}
}
