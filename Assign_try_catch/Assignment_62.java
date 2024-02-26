package Assign_try_catch;
public class Assignment_62 
{
	public static void main(String[] args) 
	{ 
		int age = 10; // Replace with the actual age value
    try 
    {
        validateAge(age);    // If the age is valid, allow access to www.google.com or perform other actions                            
        System.out.println("Access granted to www.google.com");
    } 
    catch (ArithmeticException e) 
    {
        System.out.println("Access denied: " + e.getMessage());
    }
}  
public static void validateAge(int age) 
{
    if (age > 18) 
    {
        return;
    } else 
    {  // Age is not valid, throw an exception
       
        throw new ArithmeticException("Age must be greater than 18");
    }
}

	}


