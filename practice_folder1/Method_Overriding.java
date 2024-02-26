package practice_folder1;
class method1
{
	public void add()
	{
		System.out.println("addition");
	}
}
public class Method_Overriding extends method1
{
	public void add()
	{
		super.add();
		System.out.println("addition1");
	}
	public static void main(String[] args) 
	{	
		Method_Overriding m1= new Method_Overriding();
		m1.add();
	}

}
