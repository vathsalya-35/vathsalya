package assign_String_fun;

public class Assignment_76 
{

	public static void main(String[] args) 
	{
		int listofnumbers[]= {15, 27, 41, 33, 55};
		int numbercheck=41;
		for (int i=0; i<listofnumbers.length; i++)
		{
			if (numbercheck==listofnumbers[i])
			{
				System.out.println("Number of to be check is:"+listofnumbers[i]);
				System.out.println("Index of the 41 number is:"+i);
				break;
			}
			
		}
	}

}
