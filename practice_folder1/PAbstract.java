package practice_folder1;
abstract class Abstract_method1
{
	abstract void login();
	abstract void logout();
}
public class PAbstract extends Abstract_method1
{

	public static void main(String[] args) {
		PAbstract a1=new PAbstract();
		a1.login();
		a1.logout();
	}

	@Override
	void login() {
		System.out.println("1");
		
	}

	@Override
	void logout() {
		System.out.println("2");
		
	}

}
