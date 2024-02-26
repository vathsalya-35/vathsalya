package test1;

public class Char_digit 
{
	public static void main(String[] args)
	{
		String name="name123";
		char c1[]=name.toCharArray();
		for (int i=0; i<name.length(); i++)
		{
			boolean answer= Character.isDigit(c1[i]);
			System.out.println(answer);
			if (answer==true)
			{
				System.out.println(c1[i]+ ":it is a digit:"+answer);
			}
			else 
			{
				System.out.println(c1[i]+ ":it is a chara:"+answer);
			}
			//if (answer==true)
			//{
				//System.out.println(i);
			//}*/
	     } 
	}

}
