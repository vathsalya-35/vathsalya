package assign_String_fun;

import java.util.Arrays;

public class Practice_009 
{
	public static void main(String[] args) 
	{
		                            // SPlIT functionality
		String S1="INDIA";
		String S2[]=S1.split("");
		System.out.println(S2[0]);
		
		String s1="My name is Manish";
		String[] s2=s1.split(" ");
		System.out.println(s2[0]);
		
		String[] s21=s1.split(" ");
		System.out.println(Arrays.toString(s21));

	}

}
