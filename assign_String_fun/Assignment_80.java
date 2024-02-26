package assign_String_fun;
public class Assignment_80
{
	public static void main(String[] args)
	{
		String name="Rahul123";
		char c1[]=name.toCharArray();
		for (int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if (answer==true)
			{
				System.out.println(c1[i]+ " :it is a digit:"+answer);
			}
			else
			{
				System.out.println(c1[i]+ " :is a char:"+answer);
			}
		}
    }
}
