//Launch (JSAM) HTML page get elements by xpath(absolute xpath)
package project;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_117 {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vatsalya.c/Desktop/learningHTML1.html");
		 driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Vathsalya@gmail.com");
		 driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("name");
		 driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("vasu@123");
		 driver.findElement(By.xpath("(((html/body/form)[1])/input)[1]")).sendKeys("Vasu");
		 //driver.findElement(By.xpath("(((html/body/form)[2])/input)[4]")).click();
		 
		 //driver.findElement(By.xpath("(((/html/body/form)[2])/input)[2]")).click();
		 //driver.findElement(By.xpath("(((/html/body/form)[2])/input)[4]")).click();
	}

}
