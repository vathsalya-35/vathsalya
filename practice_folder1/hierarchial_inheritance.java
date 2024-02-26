package practice_folder1;
class parent
{
	public void add()
	{
		int add=Math.addExact(20, 40);
		System.out.println(add);
	}
}
class son extends parent
{
	public void subtract()
	{
		int subtract=Math.subtractExact(6544, 2345);
		System.out.println(subtract);
	}
}
public class hierarchial_inheritance extends parent
{
	public void Multiplication()
	{
		double Multiplication=Math.multiplyExact(56, 45);
		System.out.println(Multiplication);
	}
	public static void main(String[] args) 
	{
		hierarchial_inheritance h1= new hierarchial_inheritance();
		h1.add();
		h1.Multiplication();
	}

}
