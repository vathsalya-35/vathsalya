package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_payment_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
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
        driver.findElement(By.id("sc-buy-box-ptc-button")).click();
        driver.findElement(By.name("ppw-instrumentRowSelection")).click();
        driver.findElement(By.id("pp-Axx0gU-124")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("addCreditCardNumber")).sendKeys("0989876543432");
        driver.findElement(By.name("ppw-accountHolderName")).sendKeys("PANCHAKSHARI");
        driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent")).click();
	}

}
