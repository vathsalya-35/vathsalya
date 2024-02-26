package test1;

public class Number_presence_check 
{
	public static void main(String[] args) 
	{
		int listofnumbers[]= {27,45,100,89};
		int numbercheck=45;
		for (int i=0;i<=3;i++)
		{
			if (numbercheck==listofnumbers[i])
			{
				System.out.println("number is present");
			}
			else
			{
				System.out.println("number is not present");
			}
		}
		

	}

}
