package object_Math;  //polymorphism-
class Rashmi
{
	void name1()
	{
		System.out.println("What is your name");
	}
}
public class Practice2 extends Rashmi
{
    void name1()
    {
    	super.name1();
    	System.out.println("My name is Rashmi");
    }
	public static void main(String[] args) 
	{
		//method overloading (child method is overriding the parent)
		Practice2 p1=new Practice2();
		p1.name1();
		
	    //polymorphism --->parent method is overriding the child
		Rashmi r1=new Rashmi();
		r1.name1();		
	}
}
