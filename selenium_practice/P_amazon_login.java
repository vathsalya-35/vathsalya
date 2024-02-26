//Launch Amazon Sign in page and login with Credentials.-Assignment-113
package selenium_practice;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class P_amazon_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D136127568877%26hvpone%3D%26hvptwo%3D%26hvadid%3D617721249835%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3395222829602854520%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvtargid%3Dkwd-29089840%26hydadcr%3D5716_2362046%26gclid%3DEAIaIQobChMIxpvr8IqmhAMVatdMAh3gPA5CEAAYASAAEgKMYvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("email")).sendKeys("graghuyadav25@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Raghu@96");
		 driver.findElement(By.id("signInSubmit")).click();
		 Thread.sleep(3000);
	}
}
