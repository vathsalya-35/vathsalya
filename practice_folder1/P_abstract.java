package practice_folder1;
abstract class Razorpay           // Abstract class1
{
	abstract void login();
	abstract void logout();
}
abstract class method2 extends Razorpay //abstract class 2
{
	abstract void signin();      //abstract method
	abstract void signout();      //abstract method
	public static void method3()  //static
	{
		System.out.println("Implementation2");
	}
	public void method4()          //non static
	{
		System.out.println("implementation1");
	}
	method2()                      //constructor
	{
		System.out.println("constructor");
	}
}
public class P_abstract extends method2
{
	public static void main(String[]orgs)
	{
	    P_abstract p1=new P_abstract();
		p1.login();
		p1.logout();
		p1.signin();
		p1.signout();
		p1.method4();
		method3();
	}
	void login() 
	{
       System.out.println("login");		
	}
	void logout() 
	{
		System.out.println("logout");
	}
	void signin() 
	{
		System.out.println("signin");		
	}
	void signout() {
		System.out.println("signout");
	}
}

