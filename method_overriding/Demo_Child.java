package method_overriding;
class Demo_parent
{
	void add()
	{
		System.out.println("adding 3 numbers");
	}
}
public class Demo_Child extends Demo_parent
{
    void add()
    {
    	super.add();
    	System.out.println("adding 2 numbers");
    }
	public static void main(String[] args) 
	{
		Demo_Child D1= new Demo_Child();
		D1.add();
	}

}
