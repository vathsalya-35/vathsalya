//"Count the number of links we have in amazon webpage,locate using tagname"
package project;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Print_Urls {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		System.out.println("the number of links is:"+ Links.size());
		for(int i=0; i<=Links.size()-1; i++)
		{
			WebElement a= Links.get(i);
			String url1= a.getAttribute("href");
			System.out.println(url1);
			//till the above line is to get the Url's and below lines are for the link text
			String text_message= a.getText();
			System.out.println(text_message);
		}
	}
}
