package variables;
public class Practice_circle_area //assignment33
{
	        static final double pi=3.14;
	public void area_of_circle1() 
	    {
	       double r=14;
	       double area_of_circle=(pi*r*r);
	       System.out.println(area_of_circle);
	    }
	public void area_of_circle2() 
    {
       double r=7;
       double area_of_circle= (pi*r*r);
       System.out.println(area_of_circle);
    }
	public static void main(String[] args) {
		Practice_circle_area P1= new Practice_circle_area();
		System.out.println("area of circle1: ");
		P1.area_of_circle1();
		System.out.println("area of circle2: ");
        P1.area_of_circle2();   
	}

}
