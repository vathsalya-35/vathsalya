package dropdowns_programs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_NumbersOfOptions_Dropdowns 
{
	public static void main(String[] args) 
	{
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://grotechminds.com/registration/");
	        driver.manage().window().maximize();

	        WebElement Skills_select = driver.findElement(By.name("skills"));
	        Select S1 = new Select(Skills_select);
	        S1.selectByIndex(1);
	        List<WebElement> count1 = S1.getOptions();
	        int count = count1.size();
	        System.out.println("Number of options in Skills dropdown: " + count);

	        WebElement country = driver.findElement(By.name("Country"));
	        Select s2 = new Select(country);
	        s2.selectByValue("india");

	        WebElement Religion = driver.findElement(By.name("Religion"));
	        Select s3 = new Select(Religion);
	        s3.selectByValue("Hindu");
	}

}
