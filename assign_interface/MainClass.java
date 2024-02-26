package assign_interface;
interface Amazon //Assignment 49
{
	void login();
	void logout();
}
class AmazonChild implements Amazon 
{
	@Override
	public void login() 
	{
		System.out.println("logged in to Amazon");	
	}
	@Override
	public void logout() 
	{
		System.out.println("logged out from Amazon");		
	}
}
public class MainClass {
    public static void main(String[] args) 
    {
    	 AmazonChild amazonChild = new AmazonChild();
         amazonChild.login();
         amazonChild.logout();

    }
}