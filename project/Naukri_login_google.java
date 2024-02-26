package project;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri_login_google {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
        WebElement google_link=driver.findElement(By.xpath("(//span[.='Google']))"));
        google_link.click();
        String parent_id= driver.getWindowHandle();
        Set<String>parentandchild= driver.getWindowHandles();
        System.out.println(parent_id);
        System.out.println(parentandchild);
        Thread.sleep(2000);
        Iterator<String>pcid=parentandchild.iterator();
        String parent_id1=pcid.next();
        String Child_id1= pcid.next();
        System.out.println(parent_id1);
        System.out.println(Child_id1);
        driver.close();
        driver.switchTo().window(Child_id1);
        Thread.sleep(3000);
	}

}
