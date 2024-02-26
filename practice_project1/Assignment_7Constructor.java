package practice_project1;

public class Assignment_7Constructor
{
	public Assignment_7Constructor() 
    {
    	System.out.println("Print Constructor");
    }
	public Assignment_7Constructor(int a) 
    {
    	System.out.println("Print Constructor1");
    }
	public static void main(String[] args) 
	{
		System.out.println("OUR UNIVERSE");
		Assignment_7Constructor C1= new Assignment_7Constructor();
		Assignment_7Constructor C11= new Assignment_7Constructor(42);
	}

}
