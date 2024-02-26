//WAP for return keyword for float , double , string , boolen , using scanner class
package return_keyword;
import java.util.Scanner;
public class Assignment_107 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        // Example for float
	        System.out.print("Enter a float value: ");
	        float floatResult = getFloatValue(scanner);
	        System.out.println("Returned float value: " + floatResult);

	        // Example for double
	        System.out.print("Enter a double value: ");
	        double doubleResult = getDoubleValue(scanner);
	        System.out.println("Returned double value: " + doubleResult);

	        // Example for string
	        System.out.print("Enter a string: ");
	        String stringResult = getStringValue(scanner);
	        System.out.println("Returned string: " + stringResult);

	        // Example for boolean
	        System.out.print("Enter a boolean value (true/false): ");
	        boolean booleanResult = getBooleanValue(scanner);
	        System.out.println("Returned boolean value: " + booleanResult);

	        scanner.close();
	    }
	    private static float getFloatValue(Scanner scanner) {
	        return scanner.nextFloat();
	    }
	    private static double getDoubleValue(Scanner scanner) {
	        return scanner.nextDouble();
	    }
	    private static String getStringValue(Scanner scanner) {
	        return scanner.next();
	    }
	    private static boolean getBooleanValue(Scanner scanner) {
	        return scanner.nextBoolean();
	    }
}
