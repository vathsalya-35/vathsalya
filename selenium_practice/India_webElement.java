package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India_webElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement google_search_tf= driver.findElement(By.name("q"));
		google_search_tf.sendKeys("india");
		google_search_tf.sendKeys(Keys.ENTER);
	}

}
