//WAP on LinkedList
package test1;
		import java.util.LinkedList;
		public class Assignment_98 
		{
			public static void main(String[] args) 
			{
				 LinkedList linkedList = new LinkedList();

			        // Insert some elements
			        linkedList.add(10);
			        linkedList.add(20);
			        linkedList.add(30);

			        // Display the linked list
			        System.out.println("Linked List: "+linkedList);
			        
			        // Delete a node with key 20
			        linkedList.remove(1);

			        // Display the linked list after deletion
			        System.out.println("Linked List after deletion: "+linkedList);			        
			}
	}


