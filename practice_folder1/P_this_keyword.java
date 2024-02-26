package practice_folder1;
public class P_this_keyword 
{
    int age;
    String name;
    void student_details (int age, String name)
    {
    	this.age=age;
    	this.name=name;
    	System.out.println("students details are");
    }
	public static void main(String[] args) 
	{
		P_this_keyword p1=new P_this_keyword ();
		p1.student_details(67, "Ram");
		System.out.println(p1.age);
		System.out.println(p1.name);


	}

}
