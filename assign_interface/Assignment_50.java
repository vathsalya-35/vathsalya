//Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it) and create relation between child class->interface(1st)->interface(2nd)
package assign_interface;
interface logic1{
	void login();
	void logout();
}
interface logic2{
	void signin();
	void signout();
}
public class Assignment_50 implements logic1, logic2
{
	public static void main(String[] args) 
	{
		Assignment_50 A1=new Assignment_50();
		A1.login();
		A1.logout();
		A1.signin();
		A1.signout();
	}
	@Override
	public void login() 
	{
		System.out.println("here is the logic of logic1");
	}
	@Override
	public void logout() {
		System.out.println("here is the logic of logic2 ");
	}
	@Override
	public void signin() {
		System.out.println("here is the logic of signin1");
	}
	@Override
	public void signout() {
		System.out.println("here is the logic of signout2");
	}
}
