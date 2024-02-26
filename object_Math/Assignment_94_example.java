package object_Math;

import java.util.Random;

public class Assignment_94_example
{
	public static void main(String[] args) 
	{
		   // Create a Random object to generate random radius values
        Random random = new Random();

        // Perform calculations 10 times
        for (int i = 0; i < 10; i++) 
        {
            // Generate a random radius between 1 and 10
            double r = 1 + random.nextDouble() * 9;

            // Calculate the area of the circle using the formula: area = pi * r^2
            double area = Math.PI * Math.pow(r, 2);

            // Print the result
            System.out.println("Circle " + (i + 1) + " - Radius: " + r + ", Area: " + area);
        }
	}

}
