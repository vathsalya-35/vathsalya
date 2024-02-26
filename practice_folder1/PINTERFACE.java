package practice_folder1;
interface Flipkart
{
	void login();
	void logout();
}
public class PINTERFACE implements Flipkart
{
	public static void main(String[] args) {
		PINTERFACE p1=new PINTERFACE ();
		p1.login();
		p1.logout();
	}
	@Override
	public void login() {
	  System.out.println("1");	
	}
	@Override
	public void logout() {
		System.out.println("2");
	}
}
