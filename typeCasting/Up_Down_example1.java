package typeCasting; //case1: up casting & Downcasting
class Excelsheet
{
	void Datafetching()
	{
		System.out.println("print1");
	}
}
public class Up_Down_example1 extends Excelsheet
{
	void LogintoLogout()
	{
		System.out.println("Print2");
	}
	public static void main(String[] args) 
	{  //superclass          //subclass
		Excelsheet e1=new Up_Down_example1();//upcasting
		e1.Datafetching();
		
		//Down casting is not possible without up casting
		Up_Down_example1 u1=(Up_Down_example1)e1;
		u1.LogintoLogout();
		u1.Datafetching();
	}

}
