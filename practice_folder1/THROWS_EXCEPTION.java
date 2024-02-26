package practice_folder1;
public class THROWS_EXCEPTION 
{
	void add()throws ArithmeticException, InterruptedException
	{
		Thread.sleep(2000);
		throw new ArithmeticException();		
	}
	public static void main(String[] args) 
	{
		throw new NullPointerException("you are kid");
	}
}
