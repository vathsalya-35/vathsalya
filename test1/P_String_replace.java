package test1;
public class P_String_replace {
	public static void main(String[] args) 
	{
		 // Example 1: Replace 'a' with 'A' in the name
        String name = "abhishek";
        System.out.println(name.replaceAll("a", "A"));

        // Example 2: Replace all 'a' with a space in the name
        System.out.println(name.replaceAll("a", " "));

        // Example 3: Remove all spaces from the quote
        String quote = "i love my country";
        System.out.println(quote.replaceAll(" ", ""));

        // Example 4: Remove all lowercase letters from the name
        System.out.println(name.replaceAll("[a-z]", ""));

        // Example 5: Remove all lowercase letters from another string
        String a1 = "i love my country";
        System.out.println(a1.replaceAll("[a-z]", ""));

        // Example 6: Replace all uppercase letters with a space
        System.out.println(a1.replaceAll("[A-Z]", " "));

        // Example 7: Repeat the name once
        System.out.println(name.repeat(3));
	}

}
