//
package project;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Google_india_4option //22/01/2024
{
	public static void main(String[] args) throws InterruptedException 
	{
       EdgeDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com");
       WebElement e1 =driver.findElement(By.name("q"));
       e1.sendKeys("India");
       Thread.sleep(3000);
       List<WebElement> results=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
       int counting_auto= results.size();
       System.out.println(counting_auto);
       Thread.sleep(3000);
       results.get(counting_auto-7).click();
	}
}
