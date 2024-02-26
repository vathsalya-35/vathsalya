package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_126 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		System.out.println("the number of links is:"+ Links.size());
		for(int i=0; i<=Links.size()-1; i++)
		{
			WebElement a= Links.get(i);
			String url1= a.getAttribute("href");
			System.out.println(url1);
		}
	}

}
