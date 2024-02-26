package practice_folder1;

public class Return_keyword {

	   int add (int a,int b)
	   {
		   int sum=a+b;
		   return sum;
		   
	   }
	   double subtract(int a, double b)
	   {
		   double sub= b-a;
		   return sub;
	   }
	public static void main(String[] args) 
	{
		Return_keyword r1=new Return_keyword ();
		System.out.println(r1.add(20, 90));
		System.out.println(r1.subtract(20, 200));
       
	}

}
