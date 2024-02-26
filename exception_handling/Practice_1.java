package exception_handling;

import java.util.InputMismatchException;

public class Practice_1 {

	public static void main(String[] args) {
		try 
		{
			int C=1/0;
		}
		catch(ArithmeticException a1) 
		{
			System.out.println("int can't store infinity value");
		}
        catch (NullPointerException a2)
		{
        	System.out.println("do not worry I have handled it");
		}
        catch (InputMismatchException a3)	
		{
        	System.out.println("do not worry I have handled it");
		}
	}

}
