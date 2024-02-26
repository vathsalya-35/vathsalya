package assign_String_fun;
public class Assignment_81 {
	public static void main(String[] args) 
	{
		 String inputString = "Rahul123";
	        // Find the number of characters
	        int charCount = inputString.length();

	        // Find the number of digits
	        int digitCount = 0;
	        for (char c : inputString.toCharArray()) 
	        {
	            if (Character.isDigit(c)) 
	            {
	                digitCount++;
	            }
	        }
	        System.out.println("Number of characters: " + charCount);
	        System.out.println("Number of digits: " + digitCount);
	    }

}
