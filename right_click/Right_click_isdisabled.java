package right_click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Right_click_isdisabled 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/vaths/Downloads/learningHTML1.html");
		WebElement password = driver.findElement(By.id("121"));
		boolean checking_l_name=	password.isEnabled();
		if(checking_l_name==true && password.isDisplayed()==true)
		{
			password.sendKeys("123");
		}
		else
		{
			System.out.println("Either component is not displaying or is disable");
		}	
	}
}
