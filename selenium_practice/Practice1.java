package selenium_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.amazon.in/");
		System.out.println(c1.getWindowHandle());
		System.out.println(c1.getWindowHandles());
        System.out.println(c1.getTitle());
	}

}
