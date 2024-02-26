// launch json app, click on "are you ready to relocate to bangalore?" checkbox
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Is_selected_method {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		  driver.get("file:///C:/Users/vatsalya.c/Desktop/learningHTML1.html");
		  driver.manage().window().maximize();
          WebElement checkbox= driver.findElement(By.xpath("(//html/body/input)[6]"));         
          checkbox.click();
          Thread.sleep(2000);
          if (checkbox.isSelected()==true) 
          {
        	  System.out.println("click on submit button");
          }
          else
          {
        	  checkbox.click();
          }       		  
	}
}
