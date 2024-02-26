package test1;

public class P_String_reverse {

	public static void main(String[] args) 
	{
		String input="komal";
		String output="";
		for (int i=input.length()-1; i>=0; i--)
		{
			char reverse=input.charAt(i);
			output=output+reverse;
		}
        System.out.println(output);
	}

}
