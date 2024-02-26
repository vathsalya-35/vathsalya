package variables;

public class Practice_1 
{   
	static String letter="manish";
    static double pi;
    static int a=200;
    static void add()
    {
    	int area=a*6;
    	System.out.println(area);
    }
	public static void main(String[] args) 
	{
	    add();
	    a=10;
	    System.out.println(letter);
	    System.out.println(pi);
	
	}
	
}
