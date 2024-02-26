//WAP on PriorityQueue
package test1;
import java.util.PriorityQueue;
public class Assignment_101 
{
	public static void main(String[] args) {
		PriorityQueue<Integer> P1=new PriorityQueue<Integer>();
		P1.add(20);
	    P1.add(60);
		P1.add(40);
		P1.add(10);
		 // Printing the top element of PriorityQueue
        System.out.println(P1.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(P1.poll());
 
        // Printing the top element again
        System.out.println(P1.peek());
	}
}
