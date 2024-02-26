package practice_folder1;
public class This_calling_statement 
{
     public This_calling_statement(String name)
    {
    	 this(8.0);
    	System.out.println("hello lets tell the name");
    }
     public This_calling_statement(int a)
     {
    	 this("manish");
    	 System.out.println(a+6);
     }
     public This_calling_statement(double b)
     {
    	 System.out.println(b+9);
     }
	public static void main(String[] args) 
	{
		new  This_calling_statement (5);
	}

}
