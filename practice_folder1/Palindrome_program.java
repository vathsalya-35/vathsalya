//Palindrome word "madam' --->Viva exam
package practice_folder1;

public class Palindrome_program 
{
	public static void main(String[] args) 
	{
		String input= "madam";
		String output="";
		for (int i=input.length()-1; i>=0; i--)
		{
			char reverse= input.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		if (input.equals(output))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}
}
