package typeCasting; //case:5upcasting and downcasting
class New4
{
	void four()
	{
		System.out.println("4");
	}
}
class New3 extends New4
{
	void three()
	{
		System.out.println("3");
	}
}
class New2 extends New3
{
	void two()
	{
		System.out.println("2");
	}
}
public class Assignment_93 extends New2
{
   void one()
   {
	   System.out.println("1");
   }
	public static void main(String[] args) 
	{//upcasting
         New3 n1=new New2();
         n1.three();
         n1.four();
         System.out.println("upcasting ends");
         //down casting
         New2 n2= new Assignment_93();// upcasting before downcasting
         Assignment_93 n3= (Assignment_93)n2;//downcasting
         n3.one();
         n3.two();
         n3.four();
         n3.three();
	}

}
