package assign_array;

import java.util.Arrays;

public class Assignment_65 
{
	public static void main(String[] args) 
	{
	    int rollno[]=new int[4];
	    rollno[0]=98;
	    rollno[1]=88;
	    rollno[2]=54;
	    rollno[3]=32;
	    int rn1[]=new int[4];
	    for (int i=0; i<4; i++)
	    {
	    	rn1[i]=rollno[i];
	    }
	    System.out.println("Copied array is:"+Arrays.toString(rn1));
	    System.out.println("original array is:"+Arrays.toString(rn1));
	}
}
