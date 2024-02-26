
package practice_folder1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if (s1.length()!= s2.length())
		{
			System.out.println("not a anagram");
		}
		else
		{
			char c1[]= s1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char c2[]=s2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if (Arrays.equals(c1,c2)==true)
			{
				System.out.println("it is anagram");
			}
			
		}
	}

}
