//Launch Amazon and click on mobile tab.Assignment-114
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_114 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Mobiles")).click();
		 Thread.sleep(3000);
	}
}
