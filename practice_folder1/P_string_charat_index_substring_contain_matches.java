package practice_folder1;

public class P_string_charat_index_substring_contain_matches {

	public static void main(String[] args) 
	{
	   String name="gobiManchurian";
	   System.out.println(name.charAt(9));
	   System.out.println(name.indexOf('M'));
       System.out.println(name.substring(2));
       System.out.println(name.substring(2, 11));
       System.out.println(name.contains("M"));
       System.out.println(name.matches("gobi"));
       System.out.println(name.isEmpty());
       String s1=" ";
       System.out.println(s1.isEmpty());
       System.out.println(name.endsWith("n"));
       String name1="supriya";
       /*for (int i=0; i<name1.length(); i++)
       {
    	   System.out.println(name1.charAt(i));
    	   
       }*/
       for (int i=name1.length()-1; i>=0;i--)
       {
    	   System.out.println(name1.charAt(i));
       }
	}

}
