package project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		ChromeDriver C1=new ChromeDriver();
		C1.get("http://www.flipkart.com");
      //System.out.println(C1.getWindowHandle());
	  //System.out.println(C1.getWindowHandles());
       System.out.println(C1.getTitle());
       
	}

}
