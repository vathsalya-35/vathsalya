//Launch www.flipkart.com page,search for books and click on second autosuggestion use xpath to locate autosuggestions.Assignmnet_127
package autosuggestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_BooksSearch_Assign_127
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement books_search= driver.findElement(By.xpath("(//input[@class='Pke_EE'])"));
		books_search.sendKeys("Books");
		books_search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
        List<WebElement> a2=driver.findElements(By.xpath("//a[@class='_3izBDY']"));
        Thread.sleep(9000);
        a2.get(a2.size()-6).click();
	}

}
