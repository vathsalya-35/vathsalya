package double_and_right_click;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_click_gmail 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{                                                    //right click on Gmail link
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement gmail_1=driver.findElement(By.linkText("Gmail"));
		Actions a1= new Actions(driver);
		a1.contextClick(gmail_1).perform();
		
		//After right click on any component in browser, how to select the option
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
	}

}
