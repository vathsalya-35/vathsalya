package assign_interface;
interface country //assignment 51
{
	void countryCollection();
}
abstract class state implements country
{
	abstract void state_roads();
	void statecollection() 
	{
		System.out.println("logic 3");
	}
}
public class Practice_2 extends state 
{
	public static void main(String[] args) {
		Practice_2 P1=new Practice_2();
		P1.state_roads();
		P1.statecollection();
		P1.countryCollection();
	}
	public void countryCollection() {
		System.out.println("logic 1");
	}
	void state_roads() {
		System.out.println("logic 2");
	}
}
