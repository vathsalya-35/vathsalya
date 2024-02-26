package practice_project1;
public class Assignment_10 
{
	static void add(){
		int a=5;
		int b=9;
		int c=a+b;
		System.out.println(c);
	}
	static void subtraction (){
		int a=8;
		int b=2;
		int g=a-b;
		System.out.println(g);
	}
	void multiplication(){
		int a=9;
		int b=8;
		int d=a*b;
		System.out.println(d);
	}
	void division(){
		double b=6;
		double n=3;
		double answer=b/n;
		System.out.println(answer);
	}
	public static void main(String[] args){
		add();
        subtraction();
		Assignment_10 q=new Assignment_10();
		q.multiplication();
	    q.division();
	}

}
