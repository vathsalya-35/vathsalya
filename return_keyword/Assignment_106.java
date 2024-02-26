//WAP for return keyword for int and double
package return_keyword;
public class Assignment_106 
{
    int add(int a, int b)
    {
    	int sum =a+b;
    	return sum;
    }
    double subtract(int a, double b)
    {
    	double sub=a-b;
    	return sub;
    }
	public static void main(String[] args) 
	{
		Assignment_106 a1=new Assignment_106 ();
		System.out.println(a1.add(2, 04));
		System.out.println(a1.subtract(6, 3.5));	
	}

}
