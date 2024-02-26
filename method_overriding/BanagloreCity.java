package method_overriding;
class KarnatakaState
{   // this method got overridden 
	void ITHUB()
	{
		System.out.println("Bangalore city is the of IT HUB");
	}
}
public class BanagloreCity extends KarnatakaState
{   // this is overriding the above method
	void ITHUB()
	{
		super.ITHUB();
		System.out.println("silicon city of India");
	}
	public static void main(String[] args) 
	{
		BanagloreCity B1=new BanagloreCity();
		B1.ITHUB();
	}

}
