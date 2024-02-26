// program for launching the google and searching India
package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search_India {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
