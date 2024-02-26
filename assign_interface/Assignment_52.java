//Create child class and 2 interfaces and create relation of child class with interface(1st) and relation of child class with interface(2nd) and achieve multiple level inheritance
package assign_interface;
interface state1  //Assignment 52
{
	void state_ittax();
	void state_gsttax();
}
interface country1
{
	void country_ittax();
	void country_gsttax();
}
public class Assignment_52 implements state1,country1
{
	public static void main(String[] args)
	{
		Assignment_52 A1= new Assignment_52();
		A1.state_ittax();
		A1.state_gsttax();
		A1.country_ittax();
		A1.country_gsttax();
	}
	public void country_ittax() {
		System.out.println("this is the country IT TAX");
	}

	public void country_gsttax() {
		System.out.println("this is the country GST TAX");
	}

	public void state_ittax() {
		System.out.println("this is the state IT TAX");
	}
	public void state_gsttax() {
		System.out.println("this is the state GST TAX");
	}

}
