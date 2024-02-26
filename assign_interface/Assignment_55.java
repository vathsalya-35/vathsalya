// "Create child class having relation with abstract class at abstract class having relation with interface(1st) & that interface(1st) having relation with another interface(2nd)"
package assign_interface;
interface country_01 //Assignment55
{
	void countryCollection();
}
interface state_01 extends country_01
{
	void stateCollection();
}
abstract class combination implements state_01
{
	abstract void combination();
}
public class Assignment_55 extends combination
{

	public static void main(String[] args)
	{
		Assignment_55 A1=new Assignment_55();
		A1.combination();
		A1.countryCollection();
		A1.combination();
	}
	public void stateCollection() 
	{
		System.out.println("print the collection of states");
	}

	public void countryCollection() 
	{
         System.out.println("Print the collection of a country");
	}

	void combination() 
	{
		System.out.println("combination of state and the country");
	}

}
