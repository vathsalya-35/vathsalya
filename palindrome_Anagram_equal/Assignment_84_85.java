package palindrome_Anagram_equal;
import java.util.Arrays;
public class Assignment_84_85 {
	public static void main(String[] args) 
	{
		String a1="animal";
		String a2="Malina";
		if (a1.length()!=a2.length())
		{
			System.out.println("not an Anagram");
		}
		else
		{
			char c1[]=a1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char []c2=a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if (Arrays.equals(c1, c2)==true)
			{
				System.out.println("It is a anagram");
			}
		}
		
	}

}
