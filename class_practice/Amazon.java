package class_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Amazon 
{
	@Test(dataProvider="testdata")
	public void login(String un,String pwd)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		driver.quit();
	}
	
	@DataProvider(name="testdata")
	public Object[][] data_for_amazonlogin()
	{
		Object d1[][]=new Object[7][2];
		d1[0][0]="right@username";
		d1[0][1]=	"right password";//line no 24 and 25 are the data fro test case 1
				d1[1][0]="right@username";
				d1[1][1]=	"wrong password";//line no 24 and 25 are the data fro test case 2
						d1[2][0]="wrong@username";
						d1[2][1]=	"right@password";//line no 24 and 25 are the data fro test case 3
								d1[3][0]="wrong@username";
								d1[3][1]=	"wrong password";//line no 24 and 25 are the data fro test case 4
										d1[4][0]="";
										d1[4][1]=	"any password";//line no 24 and 25 are the data fro test case 5
												d1[5][0]="right@username";
												d1[5][1]="";	//line no 24 and 25 are the data fro test case 6
														d1[6][0]="";
														d1[6][1]=""; //line no 24 and 25 are the data fro test case 7									
		return d1;		
	}
	
}