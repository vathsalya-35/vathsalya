//Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_116 
{
	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 String[] countries = {"United Arab Emirates", "United Kingdom", "United States"};
	        for (String country : countries) 
	        {
	            driver.findElement(By.partialLinkText(country)).click();
	            driver.navigate().back();  // Navigating back to the main page
	        }	     
	}
}
