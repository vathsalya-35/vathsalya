package assign_array;

public class Assignment_66 
{

	public static void main(String[] args) 
	{
		int num[]=new int[4];
		num[0]=3;
		num[1]=4;
		num[2]=5;
		num[3]=6;
		int sum=0;
		for (int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		double average=sum/num.length;
		System.out.println(average);
		double reminder=sum%num.length;
		System.out.println(reminder);
	}

}
