////area of circle with 2 different r values (to check the updated values)
package variables;
public class Assignment_33 
{
        static final double pi=3.14;
    static void area_of_circle() 
    {
       double r=14;
       double area_of_circle=(pi*r*r);
       System.out.println(area_of_circle);
    }
	public static void main(String[] args) 
	{
		double r=7;
		double area_of_circle1= (pi*r*r);
	    System.out.println(area_of_circle1);
		area_of_circle() ;
	}

}
