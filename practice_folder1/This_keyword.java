package practice_folder1;

public class This_keyword 
{
	int age;
	String name;
    void contact_details(int age, String name)
    {
    	this.age=age;
    	this.name=name;
    	System.out.println("contact details are");
    }
	public static void main(String[] args) 
	{
		This_keyword t1=new This_keyword ();
		t1.contact_details(20, "Vasu");
		System.out.println("age:"+t1.age);
		System.out.println("name:"+t1.name);
	}
}
