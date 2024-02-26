package super_class;
class City_class
{
	City_class(String a)
	{
		System.out.println("1");
	}
}
public class State_class extends City_class
{
    State_class()
    {
      super("ram");
	  System.out.println("2");
    }
	public static void main(String[] args) 
	{
		State_class C1=new State_class();
		
		
	}

}
