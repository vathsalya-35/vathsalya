package typeCasting; //case 3: upcasting & downcasting
class Upcasting2
{
	void upcasting2()
	{
		System.out.println("print3");
	}
}
class Upcasting1 extends Upcasting2
{
	void upcasting1()
	{
		System.out.println("Print2");
	}
}
public class Assignment_91 extends Upcasting1
{
		void upcasting()
		{
			System.out.println("print1");
		}
	public static void main(String[] args) 
	{//upcasting
		Upcasting1 U1=new Upcasting1();
		U1.upcasting1();
		U1.upcasting2();
		System.out.println("end of upcasting");
		//Down casting 
		Upcasting1 u2=new Assignment_91(); //do the upcasting before down casting
		Assignment_91 A1= (Assignment_91)u2;//downcasting
		A1.upcasting1();
		A1.upcasting2();
		A1.upcasting();
	}

}
