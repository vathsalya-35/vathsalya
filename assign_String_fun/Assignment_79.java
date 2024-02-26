package assign_String_fun;
public class Assignment_79 
{
	public static void main(String[] args) 
	{
       String name="Grotech12345";
       char c1[]=name.toCharArray();
       for (int i=0; i<name.length();i++)
       {
    	   boolean answer=Character.isDigit(c1[i]);
    	   System.out.println(answer);
       }
	}

}

