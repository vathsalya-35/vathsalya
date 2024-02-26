package method_overriding;
interface Amazon
{
	void login();
	void logout();
}
public class child implements Amazon{
	public static void main(String[] args) 
	{
		
	}
	@Override
	public void login() 
	{	
		System.out.println("print1");
	}
	@Override
	public void logout() 
	{
		System.out.println("print2");	
	}

}
