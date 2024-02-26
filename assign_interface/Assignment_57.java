//Create a class with 4 different methods other than main method with 4 different access specifiers and try to access them within class
package assign_interface;
public class Assignment_57 
{
	    public void publicMethod() 
	    {
	        System.out.println("This is a public method");
	    }

	    private void privateMethod() {
	        System.out.println("This is a private method");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is a protected method");
	    }

	    void defaultMethod() {
	        System.out.println("This is a default method");
	    } 
	public static void main(String[] args) 
	{
		Assignment_57 A3= new Assignment_57 ();
		A3.publicMethod();
		A3.privateMethod();
		A3.protectedMethod();
		A3.defaultMethod();
	}

}
