package object_Math;
public class Math_practice 
{
	public static void main(String[] args) 
	{
       int answer=Math.addExact(10, 20);
       System.out.println(answer);
       int answer1=Math.subtractExact(20, 10);
       System.out.println(answer1);
       int answer2=Math.multiplyExact(answer, answer1);
       System.out.println(answer2);
       double pi=Math.PI;
       System.out.println(pi);
       System.out.println(Math.random());
       for (int i=0; i<=10;i++)
       {
    	   System.out.println(Math.random());
       }
	}

}
