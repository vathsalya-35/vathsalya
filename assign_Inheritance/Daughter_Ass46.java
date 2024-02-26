//write a program for hierarchical inheritance and create a three classes(son, daughter, parent) in a single program
package assign_Inheritance;
public class Daughter_Ass46 extends parent
{
    void subtraction() 
    {
    	int a=50;
    	int b=20;
    	int sub=a-b;
    	System.out.println(sub);    	
    	}
	public static void main(String[] args) 
	{
		Daughter_Ass46 D1= new Daughter_Ass46();
		D1.add();
		D1.subtraction(); 
		son S1 =new son();
		S1.multiple();
	}
}
class parent
{
	void add() {
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);}
}
class son extends parent
{
	void multiple()
	{
	   int a=20;
	   int b=50;
	   int multi=a*b;
	   System.out.println(multi);
	}
}