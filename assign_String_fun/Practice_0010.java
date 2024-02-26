package assign_String_fun;
public class Practice_0010 
{
	public static void main(String[] args) 
	{
	/*	int number[]=new int[4];
		number[0]=78;
		number[1]=89;
		number[2]=100;
		number[3]=4;*/
		
		int listofnumber[]= {78,89,100,4};
		int rollnocheck=48;
		
		for (int i=0; i<=3; i++)
		{
			if (rollnocheck==listofnumber[i])
			{
				System.out.println("Number to be check is present in a given array:"+listofnumber[i]);
			}
			else
			{
				System.out.println("Number 48 is not present in the list:"+listofnumber[i]);
			}
		}
		System.out.println("iam done checking");
	}
}
