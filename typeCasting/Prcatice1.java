package typeCasting;

import java.util.Arrays;

public class Prcatice1 
{//check the given string is the anagram of each other
	public static void main(String[] args) 
	{
		String a1="triangle";
		String a2="integral";
	    if (a1.length()!=a2.length())
	    {
	    	System.out.println("it is not a anagram");
	    }
	    else
	    {
	    	char[]c1=a1.toCharArray();
	    	Arrays.sort(c1);
	    	System.out.println(Arrays.toString(c1));
	    	char[]c2 =a2.toCharArray();
	    	Arrays.sort(c2);
	    	System.out.println(Arrays.toString(c2));
	    	if (Arrays.equals(c1, c2)==true)
	    	{
	    		System.out.println("Anagram");
	    	}
	    }
				
	}

}
