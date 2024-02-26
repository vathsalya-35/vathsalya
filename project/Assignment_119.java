//launch amazon.in select category dropdown,select Books using arrow down key then search for software in search text field and press enter using keys function.
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_119 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]")).click();
		driver.findElement(By.id("searchDropdownBox")).click();
		for (int i = 0; i < 12; i++) 
		{
			driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
        }
		driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("software");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);	
	}
}
