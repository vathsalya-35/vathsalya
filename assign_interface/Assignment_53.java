//Do everything same as Assignment 52 but only with 4 interfaces instead of 2 && "Create child class having relation with interface(1st)1st interface having relation with 2nd interface2nd interface having relation with 3rd interface"
package assign_interface;
interface state_1 
{ //Assignment 53{
	void state_ittax1();
	void state_gsttax1();
	}
interface country_1
{
	void country_ittax1();
	void country_gsttax1();	
}
interface states_2
{
	void state_ittax2();
	void state_gsttax2();
}
interface country_2
{
	void country_ittax2();
	void country_gsttax2();
}
public class Assignment_53 implements state_1,country_1,states_2,country_2
{
	public static void main(String[] args) 
	{
		Assignment_53 A1= new Assignment_53();
		A1.country_gsttax1();
		A1.country_gsttax2();
		A1.country_ittax1();
		A1.country_ittax2();
		A1.state_gsttax1();
		A1.state_gsttax2();
		A1.state_ittax1();
		A1.state_ittax2();
	}
	public void country_ittax2() 
	{
		System.out.println("print1");
	}
	public void country_gsttax2() 
	{
		System.out.println("print2");	
	}
	public void state_ittax2() 
	{
		System.out.println("print3");
	}
	public void state_gsttax2() 
	{
		System.out.println("print4");		
	}
	public void country_ittax1() 
	{
		System.out.println("print5");
	}
	public void country_gsttax1() 
	{
		System.out.println("print6");		
	}
	public void state_ittax1() 
	{
		System.out.println("print7");
	}
	public void state_gsttax1() 
	{
		System.out.println("print8");
	}

}
