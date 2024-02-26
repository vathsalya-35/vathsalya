package Constructor;

public class Assignment_15 //program of SIB,IIB,COnstructor & main method
{
	Assignment_15() 
    {
    	System.out.println("Iam the constructor");
    }
	static
	{
		System.out.println("Iam the SIB");
	}
	{
		System.out.println("Iam the IIB");
		
	}
	public static void main(String[] args) 
	{
	    
	    System.out.println("Iam the main method");
	    new Assignment_15() ;
	}

}
