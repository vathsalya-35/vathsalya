//WAP to access 4 different access specifiers within the package
package assign_interface;
public class Assignment_58 
{
	 public void publicMethod() {
	        System.out.println("Public method");
	    }

	    private void privateMethod() {
	        System.out.println("Private method");
	    }

	    protected void protectedMethod() {
	        System.out.println("Protected method");
	    }

	    void packagePrivateMethod() {
	        System.out.println("Package-private (default) method");
	    }
	    public static void main(String[] args) 
		{
	    	Assignment_58 A3= new Assignment_58 ();
			A3.publicMethod();
			A3.privateMethod();
			A3.protectedMethod();
			A3.packagePrivateMethod();

		}
}