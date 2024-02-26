package practice_folder1;

import java.util.Arrays;

public class P_arrays_Iteration 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=40;
		rollno[1]=90;
		rollno[2]=70;
		rollno[3]=98;
		
		int rollno1[]=new int [4];
		for (int i=0;i<=3;i++)
		{
			rollno1[i]=rollno[i];
		}
		System.out.println("copied array:"+Arrays.toString(rollno1));
		System.out.println("original array:"+Arrays.toString(rollno));
	}

}
