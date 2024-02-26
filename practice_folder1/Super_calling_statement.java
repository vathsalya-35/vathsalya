package practice_folder1;
class method_01
{
	method_01()
	{
		System.out.println("print1");
	}
}
class method_02 extends method_01
{
	method_02(int a)
	{ 
		super();
		System.out.println("print2");
	}
}
public class Super_calling_statement extends method_02
{
	Super_calling_statement(int a) 
	{
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		new Super_calling_statement(6);	
	}
}
