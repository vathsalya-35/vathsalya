//Assignment-132-Launch growtechminds drag and drop page,do drag a image and drop it in target place,do the reverse of it.S
package drag_and_drop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag_and_Drop 
{
	public static void main(String[] args) throws InterruptedException 
	{                                                             
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://grotechminds.com/drag-and-drop/");
		 driver.manage().window().maximize();
         WebElement drag=driver.findElement(By.id("drag11"));
         WebElement drop=driver.findElement(By.id("div2"));
         Actions a1= new Actions(driver);
         a1.dragAndDrop(drag, drop).perform();  //till here placed the JSON in the middle box 
         Thread.sleep(3000);
         WebElement drag1=driver.findElement(By.id("div2"));
         WebElement drop1=driver.findElement(By.id("div1"));
         Actions a2= new Actions(driver);
         a2.dragAndDrop(drag1, drop1).perform();//for placing back the JSON
	}

}
