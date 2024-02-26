package assign_scanner;
import java.util.Scanner;
public class Assignment_38 {

	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the values for b & h");
		double b= S1.nextInt();
		double h=S1.nextInt();
		double area= (0.5*b*h);
		System.out.println("Area of triangle is:");
		System.out.println(area);
	}

}
