package practice_folder1;
interface test3
{
	void district();
}
interface test1 extends test3
{
	void country();
}
abstract class test2 implements test1
{
	abstract void state();
}
public class P_Interface extends test2
{
	public static void main(String[] args) 
	{
		P_Interface p2=new P_Interface();
		p2.country();
		p2.district();
        p2.state();
	}
	public void country() 
	{
		System.out.println("country");
	}
	void state() 
	{
		System.out.println("state");
	}
	public void district() 
	{
		System.out.println("district");
	}
}
