package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google_type_india1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("india");
	}

}
