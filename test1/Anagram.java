package test1;
import java.util.Arrays;
public class Anagram 
{
	public static void main(String[] args) 
	{
		String a1="Animal";
		String a2="Malina";
		if (a1.length()!= a2.length())
		{
			System.out.println("it is not a anagram");
		}
		else
		{
			char c1[]=a1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char c2[]=a2.toCharArray();
			Arrays.sort(c2);
            System.out.println(Arrays.toString(c2));
            if (Arrays.equals(c1,c2)==true)
            {
            	System.out.println("it is a anagram");
            }
            else 
            {
                System.out.println("It is not an anagram");
            }
		}
	}
}
