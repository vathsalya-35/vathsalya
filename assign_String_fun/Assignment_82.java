package assign_String_fun;

public class Assignment_82 {

	public static void main(String[] args) {
		String input="Rahul123";
		String output=" ";
		for (int i=input.length()-1; i>=0;i--)
		{
			char reverse=input.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
	}

}
