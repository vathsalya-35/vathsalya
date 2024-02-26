package typeCasting;

public class SQL_match_practice {

	public static void main(String[] args) 
	{
		String a="amol";
		String input="i love india";
		boolean a1=a.matches("....");
		System.out.println(a1);
		boolean a2=input.matches("(.*)love(.*)");
		System.out.println(a2);
	}

}
