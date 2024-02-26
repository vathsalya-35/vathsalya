package practice_folder1;
class state
{
	state()
	{
		System.out.println("this is the constructor");
	}
}
public class Super_calling_Statement1 extends state
{
	Super_calling_Statement1 ()
	{   
		super();
		System.out.println("this is the super calling statement");
	}
	public static void main(String[] args)
	{
		Super_calling_Statement1 s1=new Super_calling_Statement1 ();
	}

}
