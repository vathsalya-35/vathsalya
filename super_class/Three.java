package super_class;
class Two
{
	Two()
	{
		System.out.println("1");
	}
}
class one extends Two
{
	one()
	{
		System.out.println("2");
	}
}
public class Three extends one
{
    Three()
    {
    	System.out.println("3");
    }
	public static void main(String[] args) {
		new Three();

	}

}
