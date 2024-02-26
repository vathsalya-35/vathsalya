package Constructor;
public class Assignment_17 //one IIB and 4 constructor
{
	Assignment_17 (int a){
		System.out.println("Constructor1");
	}
	Assignment_17(String a) {
		System.out.println("Constructor2");
	}
	Assignment_17(char b){
		System.out.println("constructor3");
	}
	Assignment_17(String a, String d){
		System.out.println("constructor4");
	}
//IIB 
	{
		System.out.println("Iam the IIB");
	}
	public static void main(String[] args) 
	{
	    System.out.println("main method");
	    new Assignment_17(0);
	    new Assignment_17 (9);
		new Assignment_17("a");
		new Assignment_17('V');
		new Assignment_17("a","d");
	}

}
