//Launch amazon india search for shoes,select 30th shoe and add it to the cart inspect shoes using xpath-Assignment-128
package popup_types;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_window_popup //1st popup type-Assignment-128
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement shoes=driver.findElement(By.xpath("((//div[@class='a-section aok-relative s-image-tall-aspect'])[30])"));
		shoes.click();
		Set<String> Selected_shoe= driver.getWindowHandles();
        System.out.println(Selected_shoe);
        Iterator<String> pcid= Selected_shoe.iterator();
        String P_id=pcid.next();
        String C_id=pcid.next();
        driver.switchTo().window(C_id);
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
	}
}
