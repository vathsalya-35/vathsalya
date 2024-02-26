package assign_Inheritance1;

public class WordArrayExample //Assignment_111
{

	public static void main(String[] args) {
		 String statement = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	                                                                                         // Split the statement into an array of words
	        String[] words = statement.split("\\s+|[,\\.&]+");
	                                                                                        // Print each word in the array
	        for (String words1 : words) 
	        {
	            System.out.println(words1);
	        }
	        String statement1 = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	                                                                                  // Remove spaces and convert to lowercase for better handling
	        String cleanedStatement = statement1.replaceAll("\\s", "").toLowerCase();
	                                                                                 // Create an array of characters
	        char[] charArray = cleanedStatement.toCharArray();
	                                                                                // Print each character in the array
	        for (char c : charArray) {
	        	System.out.print(c + " ");
	        }
	}
}
