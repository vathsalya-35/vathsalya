//WAP to use getter and setter with int, char, boolean, string, float, double 
package object_Math;
class Student_Data
{
	private int age=18;
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Assignment_96 
{
	public static void main(String[] args) 
	{
		Student_Data s1=new Student_Data();
		s1.setAge(20);
		System.out.println(s1.getAge());
	}

}
