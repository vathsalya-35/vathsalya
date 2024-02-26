package test1;
class typecasting1
{
	void method1() 
	{
		System.out.println("method1");
	}
}
class typecasting2 extends typecasting1
{
	void method2()
	{
		System.out.println("method2");
	}
}
class typecasting3 extends typecasting2
{
	void method3()
	{
		System.out.println("method3");
	}
}
public class typecasting extends typecasting3
{
	void method()
	{
		System.out.println("method2");
	}
	public static void main(String[] args) 
	{
		typecasting2 t1=new typecasting3();
		t1.method1();
		t1.method2();
		typecasting3 t2= (typecasting3) t1;
		t2.method1();
		t2.method2();
		t2.method3();
	}
}
