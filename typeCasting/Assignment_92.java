package typeCasting; //case4: upcasting
class upcasting33
{
	void upcasting33()
	{
		System.out.println("print name3");
	}
}
class upcasting22 extends upcasting33
{
	void upcasting22()
	{
		System.out.println("name2");
	}
}
class upcasting11 extends upcasting22
{
	void upcasting11()
	{
		System.out.println("name1");
	}
}
public class Assignment_92 extends upcasting11
{
	void upcasting()
	{
		System.out.println("name");
	}
	public static void main(String[] args) 
	{
		upcasting22 u1=new upcasting11();
		u1.upcasting22();
		u1.upcasting33();
		System.out.println("end of upcasting");
		//Downcasting
		upcasting11 u2=new Assignment_92(); //upcasting from assgnment to upcasting11
		Assignment_92 a1=(Assignment_92)u2; //downcasting from upvcasting11 to assignmnet
		a1.upcasting();
		a1.upcasting11();
		a1.upcasting22();
		a1.upcasting33();
	}
}
