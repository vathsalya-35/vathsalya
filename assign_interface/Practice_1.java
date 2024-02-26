package assign_interface;
interface logic3  //assignment 50
{
	void login();
	void auth();
}
interface logic4 extends logic3
{
	void logout();
	void sigin();
}
public class Practice_1 implements logic4
{
	public static void main(String[] args) 
	{
		Practice_1 P1=new Practice_1();
		P1.login();
		P1.logout();
		P1.sigin();
		P1.auth();
	}
	public void login() {
		System.out.println("Here is the logic for the login");
	}
	public void auth() {
		System.out.println("Here is the logic for the auth");
	}
	public void logout() {
		System.out.println("Here is the logic for the logout");
	}
	public void sigin() {
		System.out.println("Here is the logic for the signin");
	}
}
