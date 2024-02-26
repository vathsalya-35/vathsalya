package project;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Salenium_practice {
	public static void main(String[] args) {
		ChromeDriver C1=new ChromeDriver();
		//FirefoxDriver F1= new FirefoxDriver();
		//EdgeDriver E1=new EdgeDriver();
		//SafariDriver S1=new SafariDriver();
		
		C1.close();
		C1.quit();
	}
}
