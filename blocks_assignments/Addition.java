package blocks_assignments;
public class Addition
{

	Addition (int a, double b)
	{
        double sum=a+b;
		System.out.println("sum");
	}
	Addition(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Addition (double a, double b)
	{
	    double	sum= a+b;
	    System.out.println(sum);	
	}
	public static void main(String[] args) 
	{
	 new Addition (10,2.6);
	 new Addition (2.6,7);
	 new Addition (1.1,2.1);
	 

	}

}
