package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_opening_multiple_links 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
        
		 driver.findElement(By.partialLinkText("United Arab Emirates")).click();
	        driver.navigate().back();  // Navigate back to the home page

	     driver.findElement(By.partialLinkText("United Kingdom")).click();
	        driver.navigate().back();  // Navigate back to the home page

	     driver.findElement(By.partialLinkText("United States")).click();
	        
		 /* int countrychoice=3;
		 switch(countrychoice)
		 {
		     case 1:  driver.findElement(By.partialLinkText("United Arab Emirates")).click();;
		     //break;
             case 2 : driver.findElement(By.partialLinkText("United Kingdom")).click();
			 //break;
			 case 3:  driver.findElement(By.partialLinkText("United States")).click();
			 break;
			 default: driver.navigate().back();
		  }*/
		    

	}

}
