package variables;
public class Assignment_21 
{
    int a=60;
    int b=10;
    int sum=a+b;
    int sub=a-b;
    public static void add()
    {
    	Assignment_21 A1=new Assignment_21 ();
		System.out.println(A1.sum);
    }
    public static void subtract()
    {
    	Assignment_21 A1=new Assignment_21 ();
    	System.out.println(A1.sub);
    }
	public static void main(String[] args) 
	{
		add();
		subtract();
	}
}
