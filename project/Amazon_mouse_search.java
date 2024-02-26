//Launch amazon and search for a mouse select the 6th option
package project;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Amazon_mouse_search 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("mouse");
		Thread.sleep(3000);
		List<WebElement> t2= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		t2.get(t2.size()-6).click();
	}

}
