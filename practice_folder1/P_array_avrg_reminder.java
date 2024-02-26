package practice_folder1;
public class P_array_avrg_reminder 
{
	public static void main(String[] args) 
	{
		int no[]=new int[4];
		no[0]=40;
		no[1]=90;
		no[2]=70;
		no[3]=98;
		
		int sum=0;
		for (int i=0; i<no.length; i++)
		{
			 sum=sum+no[i];
		}
		
		System.out.println(sum);
		double average=sum/(no.length);
		System.out.println(average);
		double reminder=sum%no.length;
		System.out.println(reminder);
	}
}
