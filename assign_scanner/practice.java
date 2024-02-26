package assign_scanner;
import java.util.Scanner;
class practice 
{
	public static void main(String[] args) 
	{
		 System.out.println("Enter name, age and salary:");
		                                               // String input
		    Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
		                                               // Numerical input
		    int age = scanner.nextInt();
		    double salary = scanner.nextDouble();
		                                               // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
    
	}

}
