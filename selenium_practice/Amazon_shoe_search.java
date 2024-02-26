package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoe_search {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	}

}
