package assign_String_fun;

public class Practice_05 
{
	public static void main(String[] args) 
	{
        String name="GrotechMInds";
        System.out.println(name.charAt(1));
        System.out.println(name.lastIndexOf('G'));
        System.out.println(name.substring(3));
        System.out.println(name.substring(5, 11));
        System.out.println(name.contains("M"));
        System.out.println(name.matches("Grotech"));
        System.out.println(name.endsWith("s"));
        String name1="ManishKumar";
        System.out.println(name1.substring(5, 10));
        System.out.println(name.contains("M"));
	}

}
